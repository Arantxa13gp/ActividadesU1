package Bloque4.Ejercicio3;

import Bloque5.Ejercicio3.Alumno;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(1, "Lucía", 8.9));
        alumnos.add(new Alumno(2, "Marcos", 7.4));
        alumnos.add(new Alumno(3, "Sofía", 9.5));

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));
        os.writeObject(alumnos);
        os.close();
    }
}
