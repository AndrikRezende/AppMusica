package com.example.android.appmusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PagamentoMusica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento_musica);

        TextView navegacaoBiblioteca = (TextView) findViewById(R.id.navegacao_biblioteca);
        navegacaoBiblioteca.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent bibliotecaIntent = new Intent(PagamentoMusica.this,MainActivity.class);
                startActivity(bibliotecaIntent);
            }
        });

        TextView navegacaoTocar = (TextView) findViewById(R.id.navegacao_tocar);
        navegacaoTocar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tocarIntent = new Intent(PagamentoMusica.this,TocarMusica.class);
                startActivity(tocarIntent);
            }
        });

    }

    // Uma possivel solução para o problema tecnico pode ser encontrado no link:
    // https://developer.android.com/google/play/billing/billing_integrate.html#billing-add-aidl
}
