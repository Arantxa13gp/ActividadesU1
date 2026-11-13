package Bloque1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, escribe una ruta");;

        String ruta = scan.nextLine();
        Path direcorio = Path.of(ruta);
        Instant limite = Instant.now().minus(7, ChronoUnit.DAYS);

        for (Path archivo: Files.walk(direcorio).toList()){
            if (Files.isRegularFile(archivo)){
                if (Files.getLastModifiedTime(archivo).toInstant().isBefore(limite)) {
                    Files.delete(archivo);
                    System.out.println(archivo + " Eliminado.");
                }
            }
        }
        scan.close();
    }
}
