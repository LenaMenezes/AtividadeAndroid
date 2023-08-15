package com.example.my_ex_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void abrirTela1(View view) {
        Intent intent = new Intent(this, verificarMultiplos.class);
        startActivity(intent);
    }

    public void abrirTela2(View view) {
        Intent intent = new Intent(this, Calculadora_Horario.class);
        startActivity(intent);
    }
}