package Bloque6;

import java.io.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        String Archivo = "archivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(Archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: El fichero '" + Archivo + "' no existe.");
        } catch (IOException e) {
            System.err.println("Error general de entrada/salida: " + e.getMessage());
        }
    }
}
