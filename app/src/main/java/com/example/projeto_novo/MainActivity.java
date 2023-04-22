package com.example.projeto_novo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText EdiTextLogin, EdiTextSenha;
    Button ButtonAcessar;
    TextView TextViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdiTextLogin = findViewById(R.id.EdiTextLogin);
        EdiTextSenha = findViewById(R.id.EdiTextSenha);
        ButtonAcessar = findViewById(R.id.ButtonAcessar);
        TextViewResultado = findViewById(R.id.TextViewResultado);

        ButtonAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = EdiTextLogin.getText().toString().trim();
                String senha = EdiTextSenha.getText().toString().trim();

                if (login.equals("admin") && senha.equals("123")) {
                    TextViewResultado.setText("Seja bem vindo!");
                    TextViewResultado.setTextColor(getResources().getColor(R.color.white));
                    TextViewResultado.setVisibility(View.VISIBLE);
                } else {
                    TextViewResultado.setText("Credenciais invalidas!");
                    TextViewResultado.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                    TextViewResultado.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}