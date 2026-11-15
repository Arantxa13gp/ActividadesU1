package Bloque7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * Clase que comprueba el resultado de leer un archivo vacio
 *
 * @version 1.0
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        /**
         * leer un fichero linea a linea y muestra su contenido.
         *
         * Si eñ fichero esta vacio devuelve null
         *
         * @param ruta del archivo que se va a leer
         */
        String ruta = "archivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            System.out.println(" Contenido: ");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (
                IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}