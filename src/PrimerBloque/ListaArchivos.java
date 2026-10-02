package PrimerBloque;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ListaArchivos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor introduce una ruta");
        String ruta = scan.nextLine();
        File directorio = new File(ruta);

        if (!directorio.exists()){
            System.err.println("Error, la ruta escrita no existe");
        }else if (!directorio.isDirectory()){
            System.err.println("Error, la ruta introducida no es un directorio");
        } else {

            File[] archivos = directorio.listFiles();
            for (File archivo : archivos){
                archivo.getName();
            }
        }
        scan.close();
    }
}
