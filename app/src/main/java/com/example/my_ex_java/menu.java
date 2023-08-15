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

    public void abrir_Tela1(View view) {
        Intent intent1 = new Intent(this, verificarMultiplos.class);
        startActivity(intent1);
    }
    public void abrir_Tela2(View view) {
        Intent intent2 = new Intent(this, Calculadora_Horario.class);
        startActivity(intent2);
    }
}