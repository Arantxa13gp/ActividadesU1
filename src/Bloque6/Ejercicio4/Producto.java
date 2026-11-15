package Bloque6.Ejercicio4;

import java.io.Serializable;

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + precio + " €";
    }
}

