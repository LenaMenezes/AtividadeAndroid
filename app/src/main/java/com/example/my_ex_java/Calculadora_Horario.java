package com.example.my_ex_java;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora_Horario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_horario);
    }
    @SuppressLint("")
    public void calcularHorarioSaida(View view) {
        EditText id_horario_entrada = findViewById(R.id.id_horario_entrada);
        TextView idResultado = findViewById(R.id.idResultado2);

        int horarioEntrada = Integer.parseInt(id_horario_entrada.getText().toString());
        int horarioSaida = calcularHorarioSaida(horarioEntrada);

        idResultado.setText("Horário de Saída: " + horarioSaida + "h");
    }

    public int calcularHorarioSaida(int horarioEntrada) {
        return (horarioEntrada + 6) % 24;
    }
}