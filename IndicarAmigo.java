package com.example.rafael.protecaoveicularautocar;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

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

    private void ValidaCampos() {


        String nome = edNome.getText().toString();
        String codigo = edCodigo.getText().toString();
        String data = edData.getText().toString();
        String telefone = edTel.getText().toString();
        String email = edEmail.getText().toString();
        String placa = edPlaca.getText().toString();
        String NomeAmigo = edNomeAmigo.getText().toString();
        String EmailAmigo = edEmailAmigo.getText().toString();

        boolean res;

        if (res = isCampoVazio(nome)) {
            edNome.requestFocus();
        } else if (res = isCampoVazio(codigo)) {
            edCodigo.requestFocus();
        } else if (res = isCampoVazio(data)) {
            edData.requestFocus();
        } else if (res = isCampoVazio(telefone)) {
            edTel.requestFocus();
        } else if (res = !isCampoVazio(email)) {
            edEmail.requestFocus();
        } else if (res = isCampoVazio(placa)) {
            edPlaca.requestFocus();
        } else if (res = isCampoVazio(NomeAmigo)) {
            edNomeAmigo.requestFocus();
        } else if (res = !isCampoVazio(EmailAmigo)) {
            edEmailAmigo.requestFocus();
        }

        if (res) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Aviso");
            dlg.setMessage("Há campos invalidos ou em branco!");
            dlg.setNeutralButton("OK", null);
        }


    }


    private boolean isCampoVazio(String valor) {
        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());

        return resultado;

    }

    private boolean IsEmailValido(String email) {
        boolean resultado = (!isCampoVazio(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());

        return resultado;

    }

    private boolean IsEmailValidoAmigo(String EmailAmigo) {
        boolean resultado = (!isCampoVazio(EmailAmigo) && Patterns.EMAIL_ADDRESS.matcher(EmailAmigo).matches());

        return resultado;

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_act_cad_aso, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getGroupId();
        switch (id) {
            case R.id.action_ok:

                ValidaCampos();
                break;

            case R.id.action_cancelar:
            
                finish();
                break;

        }


        return super.onOptionsItemSelected(item);
    }
}
