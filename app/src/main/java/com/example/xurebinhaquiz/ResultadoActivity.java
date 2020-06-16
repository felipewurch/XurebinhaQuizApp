package com.example.xurebinhaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView resultadoR,resultadoI,resultadoA,resultadoS,resultadoE,resultadoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultadoR = (TextView) findViewById(R.id.resultadoR);
        resultadoI = (TextView) findViewById(R.id.resultadoI);
        resultadoA = (TextView) findViewById(R.id.resultadoA);
        resultadoS = (TextView) findViewById(R.id.resultadoS);
        resultadoE = (TextView) findViewById(R.id.resultadoE);
        resultadoC = (TextView) findViewById(R.id.resultadoC);


}
}
