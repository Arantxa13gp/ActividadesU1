package Bloque1;

import java.io.File;

public class Ejercicio7 {

    public static void main(String[] args) {

        File carpeta = new File("");

        long tamano = calcularTamano(carpeta);

        double megabytes = tamano / (1024.0 * 1024.0);

        System.out.println("Tamaño total: " + megabytes + " MB");
    }

    public static long calcularTamano(File carpeta) {

        long tamanoTotal = 0;

        File[] archivos = carpeta.listFiles();

        if (archivos != null) {

            for (File archivo : archivos) {

                if (archivo.isDirectory()) {

                    tamanoTotal += calcularTamano(archivo);

                } else {

                    tamanoTotal += archivo.length();
                }
            }
        }

        return tamanoTotal;
    }
}