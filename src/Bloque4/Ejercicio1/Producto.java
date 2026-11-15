package Bloque4.Ejercicio1;

import java.util.Locale;

public class Producto {

    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toCSV() {
        return String.format(Locale.US, id + nombre + precio);
    }
}
