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
               float resul;
               float alt;
               alt = altura * altura;
               resul = peso / alt;
               resultado = resul * 10000;
               
               if(resultado <19){
                   txt_Result.setText("Abaixo do peso");
                   
               }else if(resultado > 32){
                   txt_Result.setText("Acima do peso");
               }else{
                   txt_Result.setText("Ok");
               }

           }

                                  }

       );



    }
}