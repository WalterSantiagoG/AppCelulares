package com.example.santiago.appcelulares;

import android.content.res.Resources;
import android.widget.EditText;

/**
 * Created by android on 26/09/2017.
 */

public class Celular {
    private String marca;
    private String precio;
    private String ram;
    private String color;

    public Celular(String marca, String precio, String ram, String color) {
        this.marca = marca;
        this.precio = precio;
        this.ram = ram;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
