package com.example.xurebinhaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    TextView pergunta;
    RadioButton rbResposta1, rbResposta2, rbResposta3, rbResposta4;
    int pontosR = 0;
    int pontosI = 0;
    int pontosA = 0;
    int pontosS = 0;
    int pontosE = 0;
    int pontosC = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().hide();

        pergunta = (TextView) findViewById(R.id.pergunta);
        rbResposta1 = (RadioButton) findViewById(R.id.rbResposta1);
        rbResposta2 = (RadioButton) findViewById(R.id.rbResposta2);
        rbResposta3 = (RadioButton) findViewById(R.id.rbResposta3);
        rbResposta4 = (RadioButton) findViewById(R.id.rbResposta4);
    }

    public void btnResponderOnClick(View v) {


        if (rbResposta1.isChecked()) {
            pontosR +=1;
        } else if (rbResposta2.isChecked()) {
            pontosR +=2;
        } else if (rbResposta3.isChecked()) {
            pontosR +=3;
        } else if (rbResposta4.isChecked()) {
            pontosR +=4;
        }


        Intent intent = new Intent(this, RespostaActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onRestart() {
        super.onRestart();



    }
}
