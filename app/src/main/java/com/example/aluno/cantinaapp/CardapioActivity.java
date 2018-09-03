package com.example.aluno.cantinaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.text.DecimalFormat;

public class CardapioActivity extends AppCompatActivity {
     private Button buttonSalgado;
     private Button buttonRefrigerante;
     private Button buttonPacoca;
     private Button buttonBolo;
     private Button buttonCafe;

     private Button buttonConcluir;

     private double salgado;
     private double refrigerante;
     private double pacoca;
     private double bolo;
     private double cafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);




        salgado = 3.80;
        refrigerante = 1.50;
        pacoca = 0.75;
        bolo = 2.00;
        cafe = 1.00;

        buttonSalgado = (Button) findViewById(R.id.buttonSalgado);
        buttonRefrigerante = (Button) findViewById(R.id.buttonRefrigerante);
        buttonPacoca = (Button) findViewById(R.id.buttonPacoca);
        buttonBolo = (Button) findViewById(R.id.buttonBolo);
        buttonCafe = (Button) findViewById(R.id.buttonCafe);

    }
}
