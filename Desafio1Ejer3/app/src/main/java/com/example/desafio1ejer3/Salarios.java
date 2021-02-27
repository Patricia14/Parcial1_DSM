package com.example.desafio1ejer3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Salarios extends AppCompatActivity {
    private TextView  Emp1, Emp2, Emp3;
    private TextView Salario1, Salario2, Salario3;
    private TextView Seguro1, Seguro2, Seguro3;
    private TextView Afp1, Afp2, Afp3;
    private TextView Renta1, Renta2, Renta3;
    private TextView SinBono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salarios);
        Mostrar();
    }

    public void Mostrar(){
        Bundle extras = getIntent().getExtras();
        String NomC1 = extras.getString("NombreC1");
        String NomC2 = extras.getString("NombreC2");
        String NomC3 = extras.getString("NombreC3");
        String BonoCero = extras.getString("NoBono");

        double Disss1 = extras.getDouble("isss1");
        double Disss2 = extras.getDouble("isss2");
        double Disss3 = extras.getDouble("isss3");
        double Dafp1 = extras.getDouble("afp1");
        double Dafp2 = extras.getDouble("afp2");
        double Dafp3 = extras.getDouble("afp3");
        double Dren1 = extras.getDouble("renta1");
        double Dren2 = extras.getDouble("renta2");
        double Dren3 = extras.getDouble("renta3");
        double Sflu1 = extras.getDouble("fluido1");
        double Sflu2 = extras.getDouble("fluido2");
        double Sflu3 = extras.getDouble("fluido3");

        Emp1 = findViewById(R.id.empleado1);
        Emp1.setText("Nombre: " + NomC1);
        Emp2 = findViewById(R.id.empleado2);
        Emp2.setText("Nombre: " + NomC2);
        Emp3 = findViewById(R.id.empleado3);
        Emp3.setText("Nombre: " + NomC3);

        Salario1 = findViewById(R.id.SalEmp1);
        Salario1.setText("Salario: $" + Sflu1);
        Salario2 = findViewById(R.id.SalEmp2);
        Salario2.setText("Salario: $" + Sflu2);
        Salario3 = findViewById(R.id.SalEmp3);
        Salario3.setText("Salario: $" + Sflu3);

        Seguro1 = findViewById(R.id.DesSeg1);
        Seguro1.setText("ISSS: " + Disss1);
        Seguro2 = findViewById(R.id.DesSeg2);
        Seguro2.setText("ISSS: " + Disss2);
        Seguro3 = findViewById(R.id.DesSeg3);
        Seguro3.setText("ISSS: " + Disss3);

        Afp1 = findViewById(R.id.DesAfp1);
        Afp1.setText("AFP: " + Dafp1);
        Afp2 = findViewById(R.id.DesAfp2);
        Afp2.setText("AFP: " + Dafp2);
        Afp3 = findViewById(R.id.DesAfp3);
        Afp3.setText("AFP: "+ Dafp3);

        Renta1 = findViewById(R.id.DesRen1);
        Renta1.setText("Renta: " + Dren1);
        Renta2 = findViewById(R.id.DesRen2);
        Renta2.setText("Renta: " + Dren2);
        Renta3 = findViewById(R.id.DesRen3);
        Renta3.setText("Renta: " + Dren3);

        if (BonoCero == ""){
            SinBono = findViewById(R.id.NoBono);
            SinBono.setText("NO HAY BONO PARA NIGUN EMPLEADO");
        }

    }

    public void Atras(View in){
        Intent antes = new Intent(this, MainActivity.class);
        startActivity(antes);
    }
}