package com.example.android.appmusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TocarMusica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tocar_musica);

        TextView navegacaoBiblioteca = (TextView) findViewById(R.id.navegacao_biblioteca);
        navegacaoBiblioteca.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent bibliotecaIntent = new Intent(TocarMusica.this,MainActivity.class);
                startActivity(bibliotecaIntent);
            }
        });

        TextView navegacaoPagamento = (TextView) findViewById(R.id.navegacao_pagamento);
        navegacaoPagamento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent pagamentoIntent = new Intent(TocarMusica.this,PagamentoMusica.class);
                startActivity(pagamentoIntent);
            }
        });

    }

    // Uma possivel solução para o problema tecnico pode ser encontrado no link:
    // https://developer.android.com/ndk/guides/audio/aaudio/aaudio.html?hl=pt-br
}
