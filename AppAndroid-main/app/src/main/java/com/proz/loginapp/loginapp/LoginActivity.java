package com.proz.loginapp.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.pedrorafante.loginapp.R;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;
    TextView txtCriarconta;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        databaseHelper = new DatabaseHelper(this);

        username = findViewById(R.id.etInputLogin);
        password = findViewById(R.id.etInputSenha);
        loginButton = findViewById(R.id.btnLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), PrincipalActivity.class);
//                startActivity(intent);
                if (checkAllFields()) {
                    if (databaseHelper.checkUserPassword(username.getText().toString(), password.getText().toString())) {
                        Intent intent = new Intent(getApplicationContext(), PrincipalActivity.class);
                        startActivity(intent);
//                        finish();
                    } else {
                        Toast.makeText(LoginActivity.this, "Usuário ou senha Incorretos!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        txtCriarconta = findViewById(R.id.txtCriarconta);
        txtCriarconta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean checkAllFields() {
        if (username.getText().toString().isEmpty()) {
            username.setError("Infome o username");
            username.requestFocus();
            return false;
        } else if (password.getText().toString().isEmpty()) {
            password.setError("Informe a senha");
            password.requestFocus();
            return false;
        } else {
            return true;
        }
    }
}