package com.example.xurebinhaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class QuizActivity extends AppCompatActivity {

    private Questions perguntas = new Questions();
    private TextView pergunta;
    private RadioButton rbResposta1, rbResposta2, rbResposta3, rbResposta4;
    private int pontosR = 0, pontosI = 0, pontosA = 0, pontosS = 0, pontosE = 0, pontosC = 0, ordemPergunta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().hide();
        if(savedInstanceState == null) {

            pergunta = (TextView) findViewById(R.id.pergunta);
            rbResposta1 = (RadioButton) findViewById(R.id.rbResposta1);
            rbResposta2 = (RadioButton) findViewById(R.id.rbResposta2);
            rbResposta3 = (RadioButton) findViewById(R.id.rbResposta3);
            rbResposta4 = (RadioButton) findViewById(R.id.rbResposta4);
            pergunta.setText(perguntas.getQuestionsList().get(ordemPergunta));
            ordemPergunta++;
        }

    }

    public void btnResponderOnClick(View v) {

        if (ordemPergunta < 10) {
            if (rbResposta1.isChecked()) {
                pontosR += 1;
            } else if (rbResposta2.isChecked()) {
                pontosR += 2;
            } else if (rbResposta3.isChecked()) {
                pontosR += 3;
            } else if (rbResposta4.isChecked()) {
                pontosR += 4;
            }
        } else if (ordemPergunta < 20) {
            if (rbResposta1.isChecked()) {
                pontosI += 1;
            } else if (rbResposta2.isChecked()) {
                pontosI += 2;
            } else if (rbResposta3.isChecked()) {
                pontosI += 3;
            } else if (rbResposta4.isChecked()) {
                pontosI += 4;
            }
        } else if (ordemPergunta < 30) {
            if (rbResposta1.isChecked()) {
                pontosA += 1;
            } else if (rbResposta2.isChecked()) {
                pontosA += 2;
            } else if (rbResposta3.isChecked()) {
                pontosA += 3;
            } else if (rbResposta4.isChecked()) {
                pontosA += 4;
            }
        } else if (ordemPergunta < 40) {
            if (rbResposta1.isChecked()) {
                pontosS += 1;
            } else if (rbResposta2.isChecked()) {
                pontosS += 2;
            } else if (rbResposta3.isChecked()) {
                pontosS += 3;
            } else if (rbResposta4.isChecked()) {
                pontosS += 4;
            }
        } else if (ordemPergunta < 50) {
            if (rbResposta1.isChecked()) {
                pontosE += 1;
            } else if (rbResposta2.isChecked()) {
                pontosE += 2;
            } else if (rbResposta3.isChecked()) {
                pontosE += 3;
            } else if (rbResposta4.isChecked()) {
                pontosE += 4;
            }
        } else if (ordemPergunta < 60) {
            if (rbResposta1.isChecked()) {
                pontosC += 1;
            } else if (rbResposta2.isChecked()) {
                pontosC += 2;
            } else if (rbResposta3.isChecked()) {
                pontosC += 3;
            } else if (rbResposta4.isChecked()) {
                pontosC += 4;
            }
        }
        if (ordemPergunta == 60) {

            calculaPersonalidade();
            Intent intent = new Intent(this, ResultadoActivity.class);
            startActivity(intent);
        }else {
            Intent intent = new Intent(this, RespostaActivity.class);
            startActivity(intent);
        }
    }

    public int[] calculaPersonalidade() {
        int[] porcentagens = new int[6];
        porcentagens[0] = pontosR/30*100;
        porcentagens[1] = pontosI/30*100;
        porcentagens[2] = pontosA/30*100;
        porcentagens[3] = pontosS/30*100;
        porcentagens[4] = pontosE/30*100;
        porcentagens[5] = pontosC/30*100;
        return porcentagens;
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


        Log.v("Pergunta:", String.valueOf(ordemPergunta));
        pergunta.setText(perguntas.getQuestionsList().get(ordemPergunta));
        ordemPergunta++;
    }
}