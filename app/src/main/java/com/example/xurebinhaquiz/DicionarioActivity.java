package com.example.xurebinhaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DicionarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicionario);
        getSupportActionBar().hide();
    }
}
