package com.example.my_ex_java;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class verificarMultiplos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificar_multiplos);
    }
    @SuppressLint("")
    public verificarMultiplos(View view) {
        EditText idValorA = findViewById(R.id.idValorA);
        EditText idValorB = findViewById(R.id.idValorB);
        TextView idResultado2 = findViewById(R.id.idResultado2);

        int a = Integer.parseInt(idValorA.getText().toString());
        int b = Integer.parseInt(idValorB.getText().toString());

        if (saoMultiplos(a, b)) {
            idResultado2.setText("São múltiplos");
        } else {
            idResultado2.setText("Não são múltiplos");
        }
    }

    public boolean saoMultiplos(int a, int b) {
        return a % b == 0 || b % a == 0;
    }
}