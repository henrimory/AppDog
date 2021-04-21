package com.example.appdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btGolden, btHusky, btChiuaua, btPintcher, btSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btGolden = (Button) findViewById(R.id.btn_golden);
        btHusky = (Button) findViewById(R.id.btn_husky);
        btChiuaua = (Button) findViewById(R.id.btn_chiuaua);
        btPintcher = (Button) findViewById(R.id.btn_pintcher);
        btSair = (Button) findViewById(R.id.btn_sair);

        btGolden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaGolden();
            }
        });

        btHusky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaHusky();
            }
        });

        btChiuaua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaChiuaua();
            }
        });

        btPintcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaPincher();
            }
        });

        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void telaGolden() {
        Intent tGolden = new Intent(this, TelaGolden.class);
        startActivity(tGolden);
        finish();
    }

    public void telaHusky() {
        Intent tHusky = new Intent(this, TelaHusky.class);
        startActivity(tHusky);
        finish();
    }

    public void telaChiuaua() {
        Intent tChiuaua = new Intent(this, TelaChiuaua.class);
        startActivity(tChiuaua);
        finish();
    }

    public void telaPincher() {
        Intent tPincher = new Intent(this, TelaPintcher.class);
        startActivity(tPincher);
        finish();
    }
}