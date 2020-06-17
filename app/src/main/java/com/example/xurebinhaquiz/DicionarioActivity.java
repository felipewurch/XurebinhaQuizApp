package com.example.xurebinhaquiz;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class DicionarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicionario);
        getSupportActionBar().hide();
    }
}
