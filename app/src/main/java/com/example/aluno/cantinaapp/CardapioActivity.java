package com.example.aluno.cantinaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CardapioActivity extends AppCompatActivity {
    private Button buttonSalgado;
    private TextView QntdSalgado;
    private Button buttonRefrigerante;
    private TextView QntdRefri;
    private Button buttonPacoca;
    private TextView QntdPacoca;
    private Button buttonBolo;
    private TextView QntdBolo;
    private Button buttonCafe;
    private TextView QntdCafe;

    private Button buttonConcluir;

    private double salgado;
    private double refrigerante;
    private double pacoca;
    private double bolo;
    private double cafe;

    private String formato;
    private DecimalFormat decimalFormat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        formato = "##.#";
        decimalFormat = new DecimalFormat(formato);


        salgado = 3.80;
        refrigerante = 1.50;
        pacoca = 0.75;
        bolo = 2.00;
        cafe = 1.00;



        buttonSalgado = (Button) findViewById(R.id.buttonSalgado);
        QntdSalgado = (TextView) findViewById(R.id.textViewQntdSalgado);
        buttonRefrigerante = (Button) findViewById(R.id.buttonRefrigerante);
        QntdRefri = (TextView) findViewById(R.id.textViewQntdRefri);
        buttonPacoca = (Button) findViewById(R.id.buttonPacoca);
        QntdPacoca = (TextView) findViewById(R.id.textViewQntdPacoca);
        buttonBolo = (Button) findViewById(R.id.buttonBolo);
        QntdBolo = (TextView) findViewById(R.id.textViewQntdBolo);
        buttonCafe = (Button) findViewById(R.id.buttonCafe);
        QntdCafe = (TextView) findViewById(R.id.textViewQntdCafe);

        buttonSalgado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });
        buttonRefrigerante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        buttonBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttonBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttonCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        private void atualizarSalgados(String tipo) {

            // Não precisa de chave porque é uma instrução só
            if (tipo.equals("Salgado"))


        }


    }
}




