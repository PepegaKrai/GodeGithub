package com.example.zenox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void SaveInput(View v){
        //Not functional
        EditText inputText = (EditText)findViewById(R.id.editTextTextPersonName8);
        String text = inputText.getText().toString();
    }
    public void goNextActivity(View x) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }
}