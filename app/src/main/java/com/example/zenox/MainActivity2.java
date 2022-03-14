package com.example.zenox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.Zenox.EXTRA_TEXT";
    String CPU;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void SaveInput(View v) {
        EditText Text = (EditText) findViewById(R.id.editTextCPU);
        String CPU = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextCPUFan);
        String CPUFan = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextMainboard);
        String Mainboard = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextCase);
        String Case = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextGPU);
        String GPU = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextRam);
        String RAM = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextPSU);
        String PSU = Text.getText().toString();
    }
    public void goNextActivity(View x) {
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra(EXTRA_TEXT, CPU);
        startActivity(intent);

    }
}