package com.example.santiago.appcelulares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by SANTIAGO on 26/09/2017.
 */

public class NumeroDeCelularesAppleNegro extends AppCompatActivity {

    private EditText resultadotxt2;
    int cantidad;
    private ArrayList<Celular> celulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celulares_marca_apple_negro);
        resultadotxt2 = (EditText)findViewById(R.id.txtResultadoAppleNegro);

        celulares=Datos.Obtener();

        for (int i = 0; i < celulares.size(); i++){
            if((celulares.get(i).getMarca().trim().equalsIgnoreCase("apple")) && (celulares.get(i).getColor().trim().equalsIgnoreCase("negro") || celulares.get(i).getColor().trim().equalsIgnoreCase("black")) ) {
                cantidad++;
            }
        }

        resultadotxt2.setText(""+cantidad);

    }

}
