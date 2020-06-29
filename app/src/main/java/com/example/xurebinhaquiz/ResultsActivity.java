package com.example.xurebinhaquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ListViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.ArrayList;
import java.util.List;

public class ResultsActivity extends AppCompatActivity {

    TextView resultadoR, resultadoI, resultadoA, resultadoS, resultadoE, resultadoC;
    ListView listViewContato;
    private static String URL_REGIST = "http://192.168.101.8/android/read.php";
    ContatoAdapter contatoAdapter;
    List<Contato> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        resultadoR = (TextView) findViewById(R.id.p);
        resultadoI = (TextView) findViewById(R.id.p2);
        resultadoA = (TextView) findViewById(R.id.p3);
        resultadoS = (TextView) findViewById(R.id.p4);
        resultadoE = (TextView) findViewById(R.id.p5);
        resultadoC = (TextView) findViewById(R.id.p6);

        listViewContato= (ListView) findViewById(R.id.listViewContato);
        contatoAdapter=new ContatoAdapter(ResultsActivity.this, list);
        list=new ArrayList<Contato>();

        listViewContato.setAdapter(contatoAdapter);

        listaContato();
    }
    private void listaContato(){
    Ion.with(getBaseContext())
            .load(URL_REGIST)
            .asJsonArray()
            .setCallback(new FutureCallback<JsonArray>() {
                @Override
                public void onCompleted(Exception e, JsonArray result) {
                    for (int i = 0; i < result.size(); i++) {
                        JsonObject obj = result.get(i).getAsJsonObject();
                        Contato c = new Contato();
                        c.setId(obj.get("id").getAsInt());
                        c.setNome(obj.get("nome").getAsString());
                        c.setPorcentagemR(obj.get("porcentagemR").getAsInt());
                        c.setPorcentagemI(obj.get("porcentagemI").getAsInt());
                        c.setPorcentagemA(obj.get("porcentagemA").getAsInt());
                        c.setPorcentagemS(obj.get("porcentagemS").getAsInt());
                        c.setPorcentagemE(obj.get("porcentagemE").getAsInt());
                        c.setPorcentagemC(obj.get("porcentagemC").getAsInt());

                        list.add(c);
                    }
                    contatoAdapter.notifyDataSetChanged();
                }
            });
    }

    public void btnMenuOnClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
