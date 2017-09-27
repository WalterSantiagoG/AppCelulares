package com.example.santiago.appcelulares;


import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by android on 26/09/2017.
 */

public class CrearCelulares extends AppCompatActivity {

    private EditText marca,precio,ram,color;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celulares);
        marca = (EditText)findViewById(R.id.txtMarca);
        precio = (EditText)findViewById(R.id.txtPrecio);
        ram = (EditText)findViewById(R.id.txtRam);
        color = (EditText)findViewById(R.id.txtColor);

        resources = this.getResources();
    }

    public void guardar (View view){

        String mar,pre,ra,col;
        mar = marca.getText().toString();
        pre = precio.getText().toString();
        ra = ram.getText().toString();
        col = color.getText().toString();

        Celular c = new Celular(mar,pre,ra,col);
        c.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso), Toast.LENGTH_SHORT).show();

    }

    public void limpiar (View view){

        marca.setText("");
        precio.setText("");
        ram.setText("");
        color.setText("");

    }

}
