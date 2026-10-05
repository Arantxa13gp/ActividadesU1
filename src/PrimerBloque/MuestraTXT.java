package PrimerBloque;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class MuestraTXT {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, introduce un directorio");

        String directorio = scan.next();
        Path p = Paths.get(directorio);

        for (Path q: Files.list(p).toList()){
        if (Files.isDirectory(q) && q.getFileName().toString().endsWith(".txt")) {
            System.out.println(q + ": " + " Ultima modificacion: " + Files.getLastModifiedTime(q));
        }
        }
    }
}
