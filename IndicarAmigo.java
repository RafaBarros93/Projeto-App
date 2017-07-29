package com.example.rafael.protecaoveicularautocar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;

public class IndicarAmigo extends AppCompatActivity {
    private EditText edNome;
    private EditText edCodigo;
    private EditText edData;
    private EditText edTel;
    private EditText edEmail;
    private EditText edPlaca;
    private EditText edNomeAmigo;
    private EditText edEmailAmigo;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicar_amigo);

        edNome = (EditText) findViewById(R.id.txt_nome);
        edCodigo = (EditText) findViewById(R.id.txt_cod);
        edData = (EditText) findViewById(R.id.txt_data);
        edTel = (EditText) findViewById(R.id.txt_tel);
        edEmail = (EditText) findViewById(R.id.txt_email);
        edPlaca = (EditText) findViewById(R.id.txt_placa);
        edNomeAmigo = (EditText) findViewById(R.id.txt_NomeAmigo);
        edEmailAmigo = (EditText) findViewById(R.id.txt_email_amigo);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_act_cad_aso, menu);

        return super.onCreateOptionsMenu(menu);
    }
}
