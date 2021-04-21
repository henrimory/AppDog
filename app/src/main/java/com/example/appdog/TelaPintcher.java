package com.example.appdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaPintcher extends AppCompatActivity {

    public Button btVoltar, btEnviar, btsair;
    public EditText txtnome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pintcher);

        btEnviar = (Button) findViewById(R.id.btn_Enviar_pintcher);
        btVoltar = (Button) findViewById(R.id.btn_voltar_pintcher);
        txtnome = (EditText) findViewById(R.id.txt_nome_pintcher);
        btsair = (Button) findViewById(R.id.btn_sair);

        btsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaInicial();

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