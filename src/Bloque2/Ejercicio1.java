package Bloque2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1{
    public static void main(String[] args) throws IOException {
        String palabraClave = "";
        int contador = 0;

        BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));

        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.contains(palabraClave)) {
                contador++;
            }
        }
        br.close();
        System.out.println("La palabra clase aparece en  " + contador + " lineas");
    }
}
