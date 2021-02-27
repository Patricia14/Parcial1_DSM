package com.example.desafio1ejer3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Nom1, Nom2, Nom3, Ape1, Ape2, Ape3, Car1, Car2, Car3, Tiempo1, Tiempo2, Tiempo3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nom1 = findViewById(R.id.Nombre1);
        Nom2 = findViewById(R.id.Nombre2);
        Nom3 = findViewById(R.id.Nombre3);
        Ape1 = findViewById(R.id.Apellido1);
        Ape2 = findViewById(R.id.Apellido2);
        Ape3 = findViewById(R.id.Apellido3);
        Car1 = findViewById(R.id.Cargo1);
        Car2 = findViewById(R.id.Cargo2);
        Car3 = findViewById(R.id.Cargo3);
        Tiempo1 = findViewById(R.id.Horas1);
        Tiempo2 = findViewById(R.id.Horas2);
        Tiempo3 = findViewById(R.id.Horas3);
    }

    public void Ingresar(View in){
        Intent calculos = new Intent(this, Salarios.class);
        double HorasMens1 = Double.valueOf(Tiempo1.getText().toString());
        double HorasMens2 = Double.valueOf(Tiempo2.getText().toString());
        double HorasMens3 = Double.valueOf(Tiempo3.getText().toString());
        double Cargo1 = Double.valueOf(Car1.getText().toString());
        double Cargo2 = Double.valueOf(Car2.getText().toString());
        double Cargo3 = Double.valueOf(Car3.getText().toString());
        double SalBas1 = 0, SalBas2 = 0, SalBas3 = 0;
        double ISSS1, AFP1, RENTA1;
        double ISSS2, AFP2, RENTA2;
        double ISSS3, AFP3, RENTA3;
        String BonoNull="";

        if (Nom1.getText().toString().trim().isEmpty() || Nom2.getText().toString().trim().isEmpty() || Nom3.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Rellene todos los campos de nombre por favor", Toast.LENGTH_LONG).show();
        }
        if (Ape1.getText().toString().trim().isEmpty() || Ape2.getText().toString().trim().isEmpty() || Ape3.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Rellene todos los campos de apellido por favor", Toast.LENGTH_LONG).show();
        }
        if (Car1.getText().toString().trim().isEmpty() || Car2.getText().toString().trim().isEmpty() || Car3.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Rellene todos los campos de cargo siguiendo la leyenda por favor", Toast.LENGTH_LONG).show();
        }
        if (Tiempo1.getText().toString().trim().isEmpty() || Tiempo2.getText().toString().trim().isEmpty() || Tiempo3.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Rellene todos los campos de horas mensuales trabajadas por favor", Toast.LENGTH_LONG).show();
        }
        if (HorasMens1<0 || HorasMens2<0 || HorasMens3<0){
            Toast.makeText(this, "Los campos Horas trabajadas no pueden ser negativos", Toast.LENGTH_LONG).show();
        }
        if (HorasMens1<=160){
            SalBas1 = HorasMens1*9.75;
        }
        if (HorasMens2<=160){
            SalBas2 = HorasMens2*9.75;
        }
        if (HorasMens3<=160){
            SalBas3 = HorasMens3*9.75;
        }
        if (HorasMens1>160){
            SalBas1 = 160*9.75 +(HorasMens1-160)*11.50;
        }
        if (HorasMens2>160){
            SalBas2 = 160*9.75 +(HorasMens2-160)*11.50;
        }
        if (HorasMens3>160){
            SalBas3 = 160*9.75 +(HorasMens3-160)*11.50;
        }
        ISSS1= SalBas1*0.0525; ISSS2 = SalBas2*0.0525; ISSS3 = SalBas3*0.0525;
        AFP1 = SalBas1*0.0688; AFP2 = SalBas2*0.0688; AFP3 = SalBas3*0.0688;
        RENTA1 = SalBas1*0.1; RENTA2 = SalBas2*0.1; RENTA3 = SalBas3*0.1;
        double SalF1 = SalBas1 - ISSS1 - AFP1 - RENTA1;
        double SalF2 = SalBas2 - ISSS2 - AFP2 - RENTA2;
        double SalF3 = SalBas3 - ISSS3 - AFP3 - RENTA3;
        if (Cargo1 == 1){
            SalF1 = SalF1*1.10;
        }
        if (Cargo2 == 1) {
            SalF2 = SalF2*1.10;
        }
        if (Cargo3 == 1){
            SalF3 = SalF3*1.10;
        }
        if (Cargo1 == 2){
            SalF1 = SalF1*1.05;
        }
        if (Cargo2 == 2){
            SalF2 = SalF2*1.05;
        }
        if (Cargo3 == 2){
            SalF3 = SalF3*1.05;
        }
        if (Cargo1 == 3){
            SalF1 = SalF1*1.02;
        }
        if (Cargo2 == 3){
            SalF2 = SalF2*1.02;
        }
        if (Cargo3 == 3) {
            SalF3 = SalF3*1.02;
        }
        if (Cargo1 ==1 && Cargo2 == 2 && Cargo3 == 3){
            BonoNull = "No hay bono";
            SalF1 = SalF1;
            SalF2 = SalF2;
            SalF3 = SalF3;
        }
        String NombreC1= Nom1 + " " + Ape1;
        String NombreC2 = Nom2 + " " + Ape2;
        String NombreC3 = Nom3 + " " + Ape3;
        calculos.putExtra("NomCom1", NombreC1);
        calculos.putExtra("NomCom2", NombreC2);
        calculos.putExtra("NomCom3", NombreC3);
        calculos.putExtra("isss1", ISSS1);
        calculos.putExtra("isss2", ISSS2);
        calculos.putExtra("isss3", ISSS3);
        calculos.putExtra("afp1", AFP1);
        calculos.putExtra("afp2", AFP2);
        calculos.putExtra("afp3", AFP3);
        calculos.putExtra("renta1", RENTA1);
        calculos.putExtra("renta2", RENTA2);
        calculos.putExtra("renta3", RENTA3);
        calculos.putExtra("fluido1", SalF1);
        calculos.putExtra("fluido2", SalF2);
        calculos.putExtra("fluido3", SalF3);
        calculos.putExtra("NoBono", BonoNull);

        startActivity(calculos);
    }
}