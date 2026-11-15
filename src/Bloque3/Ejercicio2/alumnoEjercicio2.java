package Bloque3.Ejercicio2;

public class alumnoEjercicio2 {

   private String nombre;
   private int edad;
   private double nota;

    public alumnoEjercicio2(String nombre, int edad, double nota){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Nota: " + nota;
    }
}
