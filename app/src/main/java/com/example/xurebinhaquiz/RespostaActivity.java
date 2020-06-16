package com.example.xurebinhaquiz;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class RespostaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);
        getSupportActionBar().hide();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finish();
            }
        });
        thread.start();
    }

}
