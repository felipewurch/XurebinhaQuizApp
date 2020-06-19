package com.example.xurebinhaquiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private String email_, name_;
    private EditText name, email;

    private static String URL_REGIST = "http://localhost/android/register.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);

    }

    public void btnEnviarOnClick(View v) {
        name_ = name.getText().toString();
        email_ = email.getText().toString();

        Log.v("name:", String.valueOf(name_));
        Log.v("email:", String.valueOf(email_));

        //todo salvar?
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}
