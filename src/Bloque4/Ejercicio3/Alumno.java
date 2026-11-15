package Bloque4.Ejercicio3;

import java.io.Serializable;
import java.util.Locale;

public class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private double nota;

    public Alumno(int id, String nombre, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String toCSV() {
        return String.format(Locale.US, id + nombre + nota);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}