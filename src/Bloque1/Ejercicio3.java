package Bloque1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor introduce una ruta");

        String ruta = scan.nextLine();

        Path p = Paths.get(ruta);
        if (Files.exists(p) ){
            System.out.println("La ruta introducida existe");
        } else if (Files.isDirectory(p)){
            System.out.println("La ruta introducida es un directorio");
        } else {
            System.out.println("La ruta introducida es un fichero");
        }
    }
}
