package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private EditText valorA, valorB, valorC;
    private TextView val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorA = (EditText) findViewById(R.id.valorA);
        valorB = (EditText) findViewById(R.id.valorB);
        valorC = (EditText) findViewById(R.id.valorC);
        val1 = (TextView) findViewById(R.id.val1);
        val2 = (TextView) findViewById(R.id.val2);

    }

    public void operar(View view) {
        String Va = valorA.getText().toString();
        String Vb = valorB.getText().toString();
        String Vc = valorC.getText().toString();
        double a = Double.parseDouble(Va);
        double b = Double.parseDouble(Vb);
        double c = Double.parseDouble(Vc);
        String V1 = "";
        String V2 = "";

        double interno = (Math.pow(b, 2) - 4 * a * c);
        double raiz = Math.sqrt((Math.pow(b, 2) - 4 * a * c));
        if (interno < 0) {
            V1=("Valor de x1=" + (-b / (2 * a)) + "+" + ((Math.sqrt(-interno))/(2*a))+ "i");
            V2=("Valor de x2=" + (-b / (2 * a)) + "-" + ((Math.sqrt(-interno))/(2*a))+ "i");
        } else {
            V1=("Valor de x1=" + ((-b + raiz) / (2 * a)));
            V2=("Valor de x2=" + ((-b - raiz) / (2 * a)));
        }
        val1.setText(V1);
        val2.setText(V2);

    }
}