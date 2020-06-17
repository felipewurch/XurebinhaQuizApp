package com.example.xurebinhaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    TextView resultadoR, resultadoI, resultadoA, resultadoS, resultadoE, resultadoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        getSupportActionBar().hide();

        resultadoR = (TextView) findViewById(R.id.resultadoR);
        resultadoI = (TextView) findViewById(R.id.resultadoI);
        resultadoA = (TextView) findViewById(R.id.resultadoA);
        resultadoS = (TextView) findViewById(R.id.resultadoS);
        resultadoE = (TextView) findViewById(R.id.resultadoE);
        resultadoC = (TextView) findViewById(R.id.resultadoC);

        // resultadoR.setText("Sua porcentagem Realista é: "+);
        // resultadoI.setText("Sua porcentagem Investigativa é: "+);
        // resultadoA.setText("Sua porcentagem Artística é: "+);
        // resultadoS.setText("Sua porcentagem Social é: "+);
        // resultadoE.setText("Sua porcentagem Empreendedora é: "+);
        // resultadoC.setText("Sua porcentagem Convencional é: "+);
    }

    public void btnDicionarioOnClick(View view) {
        Intent intent = new Intent(this, DicionarioActivity.class);
        startActivity(intent);
    }

    public void btnRefazerOnClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
