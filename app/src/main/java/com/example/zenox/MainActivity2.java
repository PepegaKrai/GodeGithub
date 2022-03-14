package com.example.zenox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    String CPU;
    String CPUFan;
    String Mainboard;
    String GPU;
    String Case;
    String RAM;
    String PSU;
    String x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void SaveInput(View v) {
        EditText Text = (EditText) findViewById(R.id.editTextCPU);
        CPU = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextCPUFan);
        CPUFan = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextMainboard);
        Mainboard = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextCase);
        Case = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextGPU);
        GPU = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextRam);
        RAM = Text.getText().toString();
        Text = (EditText) findViewById(R.id.editTextPSU);
        PSU = Text.getText().toString();
    }
    public void goNextActivity(View x) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }
}