package com.example.xurebinhaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.*;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuizActivity extends AppCompatActivity {

    private Questions perguntas = new Questions();
    private int idUser;
    private TextView pergunta;
    private List perguntaRespondida = new ArrayList();
    private RadioButton rbResposta1, rbResposta2, rbResposta3, rbResposta4;
    private int pontosR = 0, pontosI = 0, pontosA = 0, pontosS = 0, pontosE = 0, pontosC = 0, ordemPergunta = 0;
    private static String URL_REGIST = "http://localhost/android/updateAwnsers.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Intent intent = getIntent();
        Bundle resultQuiz = intent.getExtras();

        idUser = resultQuiz.getInt("idSigIn");

        pergunta = (TextView) findViewById(R.id.pergunta);
        rbResposta1 = (RadioButton) findViewById(R.id.rbResposta1);
        rbResposta2 = (RadioButton) findViewById(R.id.rbResposta2);
        rbResposta3 = (RadioButton) findViewById(R.id.rbResposta3);
        rbResposta4 = (RadioButton) findViewById(R.id.rbResposta4);
        pergunta.setText(perguntas.getQuestionsList().get(ordemPergunta));
        perguntaRespondida.add(ordemPergunta);

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

            Bundle resultadoQuiz = new Bundle();
            resultadoQuiz.putDouble("pontosR", pontosR/30.00*100.00);
            resultadoQuiz.putDouble("pontosI", pontosI/30.00*100.00);
            resultadoQuiz.putDouble("pontosA", pontosA/30.00*100.00);
            resultadoQuiz.putDouble("pontosS", pontosS/30.00*100.00);
            resultadoQuiz.putDouble("pontosE", pontosE/30.00*100.00);
            resultadoQuiz.putDouble("pontosC", pontosC/30.00*100.00);

            updateAwnsers();

            Intent intent = new Intent(this, ResultadoActivity.class);
            intent.putExtras(resultadoQuiz);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, RespostaActivity.class);
            startActivity(intent);
        }
        ordemPergunta++;

    }

    private void updateAwnsers() {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_REGIST, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    Toast.makeText(QuizActivity.this, "Reposta salva!", Toast.LENGTH_LONG).show();
                    Log.v("ok:", "Reposta salva!");

                } catch (JSONException e) {
                    Toast.makeText(QuizActivity.this, "ERRO: " + e.getMessage(), Toast.LENGTH_LONG).show();
                    Log.v("Erro:", String.valueOf(e.getMessage()));
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(QuizActivity.this, "Volley ERROR: " + error.getMessage(), Toast.LENGTH_LONG).show();
            }
        }) {
            public Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("id", String.valueOf(idUser));
                params.put("porcentagemR", String.valueOf(pontosR/30.00*100.00));
                params.put("porcentagemI", String.valueOf(pontosI/30.00*100.00));
                params.put("porcentagemA", String.valueOf(pontosA/30.00*100.00));
                params.put("porcentagemS", String.valueOf(pontosS/30.00*100.00));
                params.put("porcentagemE", String.valueOf(pontosE/30.00*100.00));
                params.put("porcentagemC", String.valueOf(pontosC/30.00*100.00));

                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
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

        rbResposta1.setChecked(false);
        rbResposta2.setChecked(false);
        rbResposta3.setChecked(false);
        rbResposta4.setChecked(false);

        pergunta.setText(perguntas.getQuestionsList().get(ordemPergunta));

    }

}