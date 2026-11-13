package Bloque1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {

        File principal = new File("");

        if (principal.mkdir()) {
            System.out.println("Se ha creado el directorio principal");
        }

        File documentos = new File(principal, "Documentos");
        File imagenes = new File(principal, "Imagenes");
        File programas = new File(principal, "Programas");

        documentos.mkdir();
        imagenes.mkdir();
        programas.mkdir();

        new File(documentos, "PDF").mkdir();
        new File(documentos, "Word").mkdir();


        new File(imagenes, "Fotos").mkdir();
        new File(imagenes, "Videos").mkdir();

        new File(programas, "Java").mkdir();
        new File(programas, "Kotlin").mkdir();

    }
}
