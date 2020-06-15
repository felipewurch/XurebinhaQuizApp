package com.example.xurebinhaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    Questions perguntas = new Questions();
    int ordemPergunta = 0;
    TextView pergunta;
    RadioButton rbResposta1, rbResposta2, rbResposta3, rbResposta4;
    int pontosR = 0;
    int pontosI = 0;
    int pontosA = 0;
    int pontosS = 0;
    int pontosE = 0;
    int pontosC = 0;

    List perguntaRespondida = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().hide();

        pergunta = (TextView)findViewById(R.id.pergunta);


        pergunta.setText(perguntas.getQuestionsList().get(ordemPergunta));


        rbResposta1 = (RadioButton) findViewById(R.id.rbResposta1);
        rbResposta2 = (RadioButton) findViewById(R.id.rbResposta2);
        rbResposta3 = (RadioButton) findViewById(R.id.rbResposta3);
        rbResposta4 = (RadioButton) findViewById(R.id.rbResposta4);

        perguntaRespondida.add(ordemPergunta);

    }

    public void btnResponderOnClick(View v) {

        while (ordemPergunta<10){
            if (rbResposta1.isChecked()) {
                pontosR += 1;
            } else if (rbResposta2.isChecked()) {
                pontosR += 2;
            } else if (rbResposta3.isChecked()) {
                pontosR += 3;
            } else if (rbResposta4.isChecked()) {
                pontosR += 4;
            }}
        while (ordemPergunta<20){
            if (rbResposta1.isChecked()) {
                pontosI += 1;
            } else if (rbResposta2.isChecked()) {
                pontosI += 2;
            } else if (rbResposta3.isChecked()) {
                pontosI += 3;
            } else if (rbResposta4.isChecked()) {
                pontosI += 4;
            }}
        while (ordemPergunta<30){
            if (rbResposta1.isChecked()) {
                pontosA += 1;
            } else if (rbResposta2.isChecked()) {
                pontosA += 2;
            } else if (rbResposta3.isChecked()) {
                pontosA += 3;
            } else if (rbResposta4.isChecked()) {
                pontosA += 4;
            }}
        while (ordemPergunta<40){
            if (rbResposta1.isChecked()) {
                pontosS += 1;
            } else if (rbResposta2.isChecked()) {
                pontosS += 2;
            } else if (rbResposta3.isChecked()) {
                pontosS += 3;
            } else if (rbResposta4.isChecked()) {
                pontosS += 4;
            }}
        while (ordemPergunta<50){
            if (rbResposta1.isChecked()) {
                pontosE += 1;
            } else if (rbResposta2.isChecked()) {
                pontosE += 2;
            } else if (rbResposta3.isChecked()) {
                pontosE += 3;
            } else if (rbResposta4.isChecked()) {
                pontosE += 4;
            }}
        while (ordemPergunta<60){
            if (rbResposta1.isChecked()) {
                pontosC += 1;
            } else if (rbResposta2.isChecked()) {
                pontosC += 2;
            } else if (rbResposta3.isChecked()) {
                pontosC += 3;
            } else if (rbResposta4.isChecked()) {
                pontosC += 4;
            }}


        Intent intent = new Intent(this, RespostaActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("PontosR:", String.valueOf(pontosR));
        Log.v("PontosI:", String.valueOf(pontosI));
        Log.v("PontosA:", String.valueOf(pontosA));
        Log.v("PontosS:", String.valueOf(pontosS));
        Log.v("PontosE:", String.valueOf(pontosE));
        Log.v("PontosC:", String.valueOf(pontosC));

        ordemPergunta++;
        pergunta.setText(perguntas.getQuestionsList().get(ordemPergunta));
        }



}
