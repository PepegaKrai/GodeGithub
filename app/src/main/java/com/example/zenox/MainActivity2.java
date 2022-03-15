package com.example.zenox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    //Defining the edittext
    EditText editText;

    //creating and defining the variable that will be sent to next activity
    public final static String EXTRA_CPU = "cpu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //assigning variable the id of the user input we want to save
        editText = findViewById(R.id.editTextCPU);

    }
    public void SaveInput(View v) {

        //Creating intent that will "link" this activity to the next one
        Intent intent = new Intent(this, MainActivity3.class);

        //create and assign what the user wrote inside to STRING CPU

        String CPU = editText.getText().toString();

        //assign whats written inside the variable CPU to EXTRA_CPU
        intent.putExtra(EXTRA_CPU, CPU);
    }
    public void goNextActivity(View x) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }
}