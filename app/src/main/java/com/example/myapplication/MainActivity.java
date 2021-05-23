package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);

    }

    public void proximaTela(View view){

        String nome = edtNome.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle parametros = new Bundle();

        parametros.putString("chave nome", nome);

        intent.putExtras(parametros);
        startActivity(intent);

    }
}

