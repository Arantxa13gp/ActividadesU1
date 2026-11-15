package Bloque6;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {

    public static void main(String[] args) {
        String ruta = "carpeta/subcarpeta/salida.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            bw.write("Guarando datos en la carpeta.");
            System.out.println("Archivo guardado.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se puede crear el archivo porque la carpeta de destino no existe.");
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
