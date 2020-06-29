package com.example.xurebinhaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DicionarioActivity extends AppCompatActivity {

    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicionario);
        getSupportActionBar().hide();
    }
    public void btnVoltarOnClick(View v){
        this.v = v;
        Intent intent = new Intent(this, ResultadoActivity.class);
        startActivity(intent);
    }
}
