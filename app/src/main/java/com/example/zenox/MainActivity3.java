package com.example.zenox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {
    //txt will be used to store Textview id that needs to appear on screen
    TextView txt;

    String txtCPU;
    //textViewCPU will be used to store textView id of the textview that needs to have its attributes changed
    TextView textViewCPU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //assign textviewCPU the id of the 'textview' that will change its content
        textViewCPU = findViewById(R.id.textViewb4);

        Intent intent = getIntent();

        String new_CPU = intent.getStringExtra(MainActivity2.EXTRA_CPU);

        //here is a test to see whether if function would work.
        //possible could be by example if new cpu i7-9700k TextViewCPU.setText("Here is a yt video in which someone built this exact model into his build.
        if (new_CPU == "x") {
        textViewCPU.setText("Hi heres the solution");
        }
        else { //in actual code else would be replaced with elif, it will check for all kinds of cpu brands/models by looking like :elif (new_CPU=="model") etc.
            txtCPU = "xxx";
        }

        }

    public void OpenAdvice(View v){
        //set the id of pressed button to int id
        int id = v.getId();

        switch (id){
            case R.id.b4:
                txt=(TextView) findViewById(R.id.textViewb4);
                break;
            case R.id.b5:
                txt=(TextView) findViewById(R.id.textViewb5);
                break;
            case R.id.b6:
                txt=(TextView) findViewById(R.id.textViewb6);
                break;
            case R.id.b7:
                txt=(TextView) findViewById(R.id.textviewb7);
                break;
            case R.id.b8:
                txt=(TextView) findViewById(R.id.textViewb8);
                break;
            case R.id.b9:
                txt=(TextView) findViewById(R.id.textViewb9);
                break;
            case R.id.b10:
                txt=(TextView) findViewById(R.id.textViewb10);
                break;
        }
        txt.setVisibility(View.VISIBLE);
;

        }
        }