package com.example.appdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaChiuaua extends AppCompatActivity {

    public Button btVoltar, btEnviar,btSair;
    public EditText txtnome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_chiuaua);

        btEnviar = (Button) findViewById(R.id.btn_Envia_chiuaua);
        btVoltar = (Button) findViewById(R.id.btn_voltar_Tchiuaua);
        txtnome = (EditText) findViewById(R.id.text_nome_tChiuaua);
        btSair = (Button) findViewById(R.id.btn_sair);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaInicial();

            }
        });

        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviaDados();
            }
        });
    }

    public void telaInicial() {
        Intent telaInicio = new Intent(this, MainActivity.class);
        startActivity(telaInicio);
    }

    public void enviaDados() {
        String nome = txtnome.getText().toString();
        Bundle parametros = new Bundle();
        parametros.putString("teste1", nome);
        Intent telaDados = new Intent(this, TelaDados.class);
        telaDados.putExtras(parametros);
        startActivity(telaDados);
    }
}