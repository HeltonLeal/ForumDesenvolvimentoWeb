package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Intent intentRecebedora = getIntent();

        Bundle parametros = intentRecebedora.getExtras();

        if (parametros != null) {
            String nome = parametros.getString("chave nome");



            Toast.makeText(MainActivity2.this, "Olá " + nome + " Seja Bem Vindo(a) ", Toast.LENGTH_LONG).show();
        }

        getSupportActionBar().hide();

    }
}