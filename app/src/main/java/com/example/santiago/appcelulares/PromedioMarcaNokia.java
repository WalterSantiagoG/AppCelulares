package com.example.santiago.appcelulares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class PromedioMarcaNokia extends AppCompatActivity {

    private EditText resultadotxt;

    int resultado=0;
    int preciooo=0;
    int cont=0;
    private ArrayList<Celular> celulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio_marca_nokia);
        resultadotxt = (EditText)findViewById(R.id.txtResultadoNokia);

        celulares=Datos.Obtener();

        for (int i = 0; i < celulares.size(); i++){
           if(celulares.get(i).getMarca().trim().equalsIgnoreCase("nokia") ) {
                preciooo = preciooo + Integer.parseInt(celulares.get(i).getPrecio());
               cont++;
           }
        }

        if (cont != 0){
            resultado = preciooo/cont;
            resultadotxt.setText(""+resultado);
        }else{
            resultadotxt.setText("0");
        }

    }


}
