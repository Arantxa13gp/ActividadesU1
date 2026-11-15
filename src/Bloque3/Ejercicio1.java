package Bloque3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new  FileReader("C:\\Users\\Admin\\IdeaProjects\\ActividadesU1\\src\\Bloque3\\usuarios.txt"));
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");

            String nombre = datos[0];
            int edad = Integer.parseInt(datos[1]);
            String correo = datos[2];

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Correo: " + correo);
        }
        br.close();
    }
}
