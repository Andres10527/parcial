package com.example.andres.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.prmja.http.prmja_com;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    private TextView Resultado;

    // VARIABLES
    double a;
    double b;
    String op;
    private Button igual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Resultado = (TextView) findViewById(R.id.Resultado);
        Resultado.setText("0");
        igual = (Button) findViewById(R.id.igual);
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = Double.parseDouble(Resultado.getText().toString());
                try {
                    server_post(a, b, op);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public void server_post(double a,double b, String op) throws IOException {
        String res = "";
        try {
            String[] params = {"a", ""+a, "b", ""+b,"o",op};
            //Http Get Method
            res = prmja_com.Post("http://162.243.64.94/dm.php", params);
            Resultado.setText(res);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

  //METODO PARA RESTAR

    public void resta(View v){
        a=Double.parseDouble( Resultado.getText().toString());
        op="res";
        Resultado.setText("0");

    }


    //METODO PARA MULTIPLICAR
    public void multiplicacion(View v){
        a=Double.parseDouble( Resultado.getText().toString());
        op="mul";
        Resultado.setText("0");


    }

    //METODO PARA DIV

    public void division(View v){
        a=Double.parseDouble( Resultado.getText().toString());
        op="div";
        Resultado.setText("0");


        //METODO PARA SUMAR
    }
    public void suma(View v){
        a=Double.parseDouble( Resultado.getText().toString());
        op="sum";
        Resultado.setText("0");

    }

    //METODO   PUNTOS
    public void punto(View v){

       Resultado.setText(Resultado.getText()+".");

   }


    //METODO DEL NUMERO 1
    public void num_1(View v){
        if(Resultado.getText()=="0"){
            Resultado.setText("1");
        }else if(Resultado.getText()!="0"){
            Resultado.setText(Resultado.getText()+"1");
        }

    }



    //METODO DEL NUMERO 2
    public void num_2(View v){
        if(Resultado.getText()=="0"){
            Resultado.setText("2");
        }else if(Resultado.getText()!="0"){
            Resultado.setText(Resultado.getText()+"2");
        }

    }


    //METODO DEL NUMERO 3

    public void num_3(View v){
        if(Resultado.getText()=="0"){
            Resultado.setText("3");
        }else if(Resultado.getText()!="0"){
            Resultado.setText(Resultado.getText()+"3");
        }

    }


    //METODO DEL NUMERO 4
    public void num_4(View v){
        if(Resultado.getText()=="0"){
            Resultado.setText("4");
        }else if(Resultado.getText()!="0"){
            Resultado.setText(Resultado.getText()+"4");
        }

    }


    //METODO DEL NUMERO 5
    public void num_5(View v){
        if(Resultado.getText()=="0"){
            Resultado.setText("5");
        }else if(Resultado.getText()!="0"){
            Resultado.setText(Resultado.getText()+"5");
        }

    }

    //METODO DEL NUMERO 6

    public void num_6(View v){
        if(Resultado.getText()=="0"){
            Resultado.setText("6");
        }else if(Resultado.getText()!="0"){
            Resultado.setText(Resultado.getText()+"6");
        }

    }


    //METODO DEL NUMERO 7
    public void num_7(View v){
        if(Resultado.getText()=="0"){
            Resultado.setText("7");
        }else if(Resultado.getText()!="0"){
            Resultado.setText(Resultado.getText()+"7");
        }

    }


    //METODO DEL NUMERO 8
    public void num_8(View v){
        if(Resultado.getText()=="0"){
            Resultado.setText("8");
        }else if(Resultado.getText()!="0"){
            Resultado.setText(Resultado.getText()+"8");
        }

    }

    //METODO DEL NUMERO 9

    public void num_9(View v){
        if(Resultado.getText()=="0"){
            Resultado.setText("9");
        }else if(Resultado.getText()!="0"){
            Resultado.setText(Resultado.getText()+"9");
        }

    }


    //M DEL NUMERO 10
    public void num_0(View v){
        if(Resultado.getText()=="0"){
            Resultado.setText("0");
        }else if(Resultado.getText()!="0"){
            Resultado.setText(Resultado.getText()+"0");
        }

    }

  //METODO LIMPIAR


    public void limpiar(View v){

        a=Double.parseDouble( Resultado.getText().toString());
        op="sum";
        Resultado.setText("");
        }

    }













