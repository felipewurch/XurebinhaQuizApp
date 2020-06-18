package com.example.xurebinhaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    private TextView resultadoR, resultadoI, resultadoA, resultadoS, resultadoE, resultadoC;
    private Double pontosR, pontosI, pontosA, pontosS, pontosE, pontosC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        getSupportActionBar().hide();

        Intent intent = getIntent();
        Bundle resultQuiz = intent.getExtras();

        pontosR = resultQuiz.getDouble("pontosR");
        pontosI = resultQuiz.getDouble("pontosI");
        pontosA = resultQuiz.getDouble("pontosA");
        pontosS = resultQuiz.getDouble("pontosS");
        pontosE = resultQuiz.getDouble("pontosE");
        pontosC = resultQuiz.getDouble("pontosC");

        resultadoR = (TextView) findViewById(R.id.resultadoR);
        resultadoI = (TextView) findViewById(R.id.resultadoI);
        resultadoA = (TextView) findViewById(R.id.resultadoA);
        resultadoS = (TextView) findViewById(R.id.resultadoS);
        resultadoE = (TextView) findViewById(R.id.resultadoE);
        resultadoC = (TextView) findViewById(R.id.resultadoC);

        resultadoR.setText("Sua porcentagem Realista é: " + pontosR);
        resultadoI.setText("Sua porcentagem Investigativa é: " + pontosI);
        resultadoA.setText("Sua porcentagem Artística é: " + pontosA);
        resultadoS.setText("Sua porcentagem Social é: " + pontosS);
        resultadoE.setText("Sua porcentagem Empreendedora é: " + pontosE);
        resultadoC.setText("Sua porcentagem Convencional é: " + pontosC);
    }
}
