package com.example.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2,tv3,tv4;
    int contar1 =0;
    int contar2 =0;
    int contar3 =0;
    int contar4 =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView) findViewById(R.id.tv1);
        tv2=(TextView) findViewById(R.id.tv2);
        tv3=(TextView) findViewById(R.id.tv3);
        tv4=(TextView) findViewById(R.id.tv4);

    }
    public void contador1 (View view){
        contar1++;
        tv1.setText(Integer.toString(contar1));
       }
    public void contador2 (View view){
        contar2++;
        tv2.setText(Integer.toString(contar2));
    }
    public void contador3 (View view){
        contar3++;
        tv3.setText(Integer.toString(contar3));
    }
    public void contador4 (View view){
        contar4++;
        tv4.setText(Integer.toString(contar4));
    }

    public void cierre (View view){
        String V1 = tv1.getText().toString();
        String V2 = tv2.getText().toString();
        String V3 = tv3.getText().toString();
        String V4 = tv4.getText().toString();
        double T1 = Double.parseDouble(V1);
        double T2 = Double.parseDouble(V2);
        double T3 = Double.parseDouble(V3);
        double T4 = Double.parseDouble(V4);
        double terminar = T1+T2+T3+T4;
        double porce1= ((T1*100)/terminar);
        double porce2= ((T2*100)/terminar);
        double porce3= ((T3*100)/terminar);
        double porce4= ((T4*100)/terminar);
        String resultado1= "Candidato1: Votos: " +T1+"\n Porcentaje: "+porce1+"%" ;
        String resultado2= "Candidato2: Votos: " +T2+"\n Porcentaje: "+porce2+"%"  ;
        String resultado3= "Candidato3: Votos: " +T3+"\n Porcentaje: "+porce3+"%"  ;
        String resultado4= "Candidato4: Votos: " +T4+"\n Porcentaje: "+porce4+"%" ;
        tv1.setText(resultado1);
        tv2.setText(resultado2);
        tv3.setText(resultado3);
        tv4.setText(resultado4);
    }

}