package com.example.appdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaDados extends AppCompatActivity {

    private TextView textonome;
    private Button voltar, sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dados);

        textonome = (TextView) findViewById(R.id.exibe_dados);
        voltar = (Button) findViewById(R.id.btn_volta_tdados);
        sair = (Button) findViewById(R.id.btn_sair);

        Intent telaAnterior = getIntent();
        if (telaAnterior != null)  {
            Bundle morango = telaAnterior.getExtras();
            if(morango != null) {
                String nome = morango.getString("teste1");
                textonome.setText(nome);
            }
        }

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaInicial();
            }
        });
    }

    public void telaInicial() {
        Intent telaInicio = new Intent(this, MainActivity.class);
        startActivity(telaInicio);
    }
}