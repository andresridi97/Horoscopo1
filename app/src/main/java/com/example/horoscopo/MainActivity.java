package com.example.horoscopo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etn, etc, ete, nd, nm, na;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn = (EditText)findViewById(R.id.txt_nombre);
        etc = (EditText)findViewById(R.id.txt_cuenta);
        ete = (EditText)findViewById(R.id.txt_correo);
        nd = (EditText)findViewById(R.id.dia);
        na = (EditText)findViewById(R.id.vt11);
        nm = (EditText)findViewById(R.id.mes);
    }
    public void Resultados(View view) {
        String nombre = etn.getText().toString();
        String cuenta = etc.getText().toString();
        String correo = ete.getText().toString();
        String ndia = nd.getText().toString();
        String nmes = nm.getText().toString();
        String nano = na.getText().toString();

        if (nombre.length() == 0) {
            Toast.makeText(this, "Debes ingresar un nombre", Toast.LENGTH_LONG).show();
        }
        if (cuenta.length() == 0) {
            Toast.makeText(this, "Debes ingresar una número de cuenta", Toast.LENGTH_LONG).show();
        }
        if (cuenta.length() != 10) {
            Toast.makeText(this, "Debes ingresar una número de cuenta de 10 digitos", Toast.LENGTH_LONG).show();
        }
        if (correo.length() == 0) {
            Toast.makeText(this, "Debes ingresar un e-mail", Toast.LENGTH_LONG).show();
        }
        if (ndia.length() == 0 ) {
            Toast.makeText(this, "Debes ingresar un número de día", Toast.LENGTH_LONG).show();
        }
        if (nmes.length() == 0) {
            Toast.makeText(this, "Debes ingresar un número de mes", Toast.LENGTH_LONG).show();
        }
        if (nano.length() == 0) {
            Toast.makeText(this, "Debes ingresar un número de año", Toast.LENGTH_LONG).show();
        }
        if (nombre.length() != 0 && cuenta.length() != 10 && cuenta.length() != 0 && correo.length() != 0 && ndia.length() != 0 && nmes.length() != 0 && nano.length() != 0 ) {
            Intent siguiente = new Intent(this, Actvidad2.class);
            startActivity(siguiente);
        }
    }
}
