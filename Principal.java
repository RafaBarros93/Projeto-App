package com.example.rafael.protecaoveicularautocar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    private Button botao;
    private Button botao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        botao = (Button) findViewById(R.id.btn_verificar);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iten = new Intent(Principal.this, ListasDeOficinas.class);
                startActivity(iten);
            }
        });

        botao2 = (Button) findViewById(R.id.btn_indicar);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iten = new Intent(Principal.this, IndicarAmigo.class);
            }
        });

    }


}
