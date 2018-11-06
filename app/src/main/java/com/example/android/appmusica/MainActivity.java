package com.example.android.appmusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView navegacaoTocar = (TextView) findViewById(R.id.navegacao_tocar);
        navegacaoTocar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent tocarIntent = new Intent(MainActivity.this,TocarMusica.class);
                startActivity(tocarIntent);
            }
        });

        TextView navegacaoPagamento = (TextView) findViewById(R.id.navegacao_pagamento);
        navegacaoPagamento.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent pagamentoIntent = new Intent(MainActivity.this,PagamentoMusica.class);
                startActivity(pagamentoIntent);
            }
        });

    }

    // Uma possivel solução para o problema tecnico pode ser encontrado no link:
    // https://pt.stackoverflow.com/questions/48317/como-listar-diretorio-em-um-listview
}
