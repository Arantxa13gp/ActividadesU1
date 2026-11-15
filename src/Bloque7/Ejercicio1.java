package Bloque7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase con metodos de lectura y escritura de ficheros cvs
 * @version 1.0
 */

public class Ejercicio1 {

    /**
     * Metodo que escribe una lineas de texto en un fichero. Si el fichero ya existe, su contenido será sobrescrito.
     *
     * @param ruta   Ruta relativa o absoluta del fichero de destino.
     * @param lineas cadenas de texto que se desean escribir.
     * @throws IOException Si ocurre un error de entrada/salida al crear o escribir en el fichero
     */
    public static void escribirFichero(String ruta, String lineas) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));

        bw.write(lineas);
        bw.newLine();
    }

    /**
     * Metodo lee todo el contenido de un fichero de texto línea por línea y lo devuelve.
     *
     * @param ruta Ruta relativa o absoluta del fichero que se desea leer.
     * @throws IOException Si el fichero no existe, es un directorio u ocurre un fallo durante la lectura.
     */

    public static void leerFichero(String ruta) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        String linea;
        System.out.println("Contenido del fichero: ");
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();
    }
}