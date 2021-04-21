package com.example.appdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaGolden extends AppCompatActivity {

    public Button btVoltar, btEnviar, btsair;
    public EditText txtnome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_golden);

        btEnviar = (Button) findViewById(R.id.btn_Envia_golden);
        btVoltar = (Button) findViewById(R.id.btn_voltar_Tgolden);
        txtnome = (EditText) findViewById(R.id.text_nome_tGolden);
        btsair = (Button) findViewById(R.id.btn_sair);

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

        btsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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