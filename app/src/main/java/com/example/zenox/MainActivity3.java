package com.example.zenox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }
    public void OpenAdvice(View v){
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
        }
    }