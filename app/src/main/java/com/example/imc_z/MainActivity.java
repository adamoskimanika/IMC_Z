package com.example.imc_z;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();//retira a barra azul
        setContentView(R.layout.activity_main);

        final TextView txt_Altura = (TextView) findViewById(R.id.txt_altura);
        final TextView txt_Peso = (TextView) findViewById(R.id.txt_peso);
        final TextView txt_Result = (TextView) findViewById(R.id.txt_result);

        final EditText edt_Altura = (EditText) findViewById(R.id.edt_altura);
        final EditText edt_Peso = (EditText) findViewById(R.id. edt_peso);

       final Button button = (Button)findViewById(R.id.btn_calcular);
       button.setOnClickListener (new View.OnClickListener(){
           public void onClick (View v){
               int peso = Integer.parseInt(edt_Peso.getText().toString());
               float altura = Float.parseFloat(edt_Altura.getText().toString());

               float resultado;

               resultado = peso / (altura * altura) * 10000;


               if(resultado <18.5){
                   txt_Result.setText("Abaixo do peso");

               }else if(resultado>=25 & resultado <=29.9 ){
                   txt_Result.setText("Peso normal");
               }else if (resultado >= 30 && resultado <= 39.9){
                   txt_Result.setText("Obesidade");
               }
               else if (resultado >40){
                   txt_Result.setText("Obesidade Morbida");
               }

           }

                                  }

       );



    }
}