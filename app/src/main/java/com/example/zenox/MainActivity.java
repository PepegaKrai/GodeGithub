package com.example.zenox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenTroubleshoot(View v) {
        Intent intent = new Intent(this, com.example.zenox.MainActivity2.class);
        startActivity(intent);
    }
}