package com.example.rafael.protecaoveicularautocar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ListasDeOficinas extends AppCompatActivity {
    private ImageButton avancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas_de_oficinas);
        avancar = (ImageButton) findViewById(R.id.imageBtn_proximo);
        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximo = new Intent(ListasDeOficinas.this, ListasDeOficinas2.class);
                startActivity(proximo);
            }
        });

    }
}
