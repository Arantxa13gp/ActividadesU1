
package Bloque3.Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) throws IOException {

        ArrayList<alumnoEjercicio2> alumnos = new ArrayList<>();

        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Admin\\IdeaProjects\\ActividadesU1\\src\\Bloque3\\Ejercicio2\\alumnosEjercicio2.csv"));

        String linea;

        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split(",");

            String nombre = datos[0];
            int edad = Integer.parseInt(datos[1]);
            double nota = Double.parseDouble(datos[2]);

            alumnoEjercicio2 alumno = new alumnoEjercicio2(nombre, edad, nota);

            alumnos.add(alumno);
        }

        br.close();

        for (alumnoEjercicio2 alumno : alumnos) {

            System.out.println(alumno);
        }
    }
}
