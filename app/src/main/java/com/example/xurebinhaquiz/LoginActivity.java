package com.example.xurebinhaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.*;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class LoginActivity extends AppCompatActivity {

    private EditText edit_nome, edit_email;
    private static String URL_REGIST = "http://192.168.101.8/android/sigin.php";
    private int idSigin,gameType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        edit_nome = (EditText) findViewById(R.id.name);
        edit_email = (EditText) findViewById(R.id.email);

    }

    public void btnEnviarOnClick(View v) {
        Regist();
        Bundle resultadoQuiz = new Bundle();
        resultadoQuiz.putInt("idSigIn", idSigin);
        gameType=0;
        Bundle type = new Bundle();
        type.putInt("gameType", gameType);

        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtras(resultadoQuiz);

        startActivity(intent);
    }
    private void Regist() {

        final String var_nome = this.edit_nome.getText().toString();
        final String var_email = this.edit_email.getText().toString();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL_REGIST, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    idSigin = Integer.parseInt(jsonObject.getString("id"));
                    Toast.makeText(LoginActivity.this, "Cadastrado com sucesso!", Toast.LENGTH_LONG).show();
                    Log.v("ok: ", "Cadastrado com sucesso!");

                } catch (JSONException e) {
                    Toast.makeText(LoginActivity.this, "ERRO: " + e.getMessage(), Toast.LENGTH_LONG).show();
                    Log.v("Erro: ", String.valueOf(e.getMessage()));
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(LoginActivity.this, "Volley ERROR: " + error.getMessage(), Toast.LENGTH_LONG).show();
            }
        }) {
            public Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("nome", var_nome);
                params.put("email", var_email);

                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    public void btnEnviar2OnClick(View view) {
        Regist();
        Bundle resultadoQuiz = new Bundle();
        resultadoQuiz.putInt("idSigIn", idSigin);
        gameType=1;
        Bundle type = new Bundle();
        resultadoQuiz.putInt("gameType", gameType);

        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtras(resultadoQuiz);

        startActivity(intent);
    }
}