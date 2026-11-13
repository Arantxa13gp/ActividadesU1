package Bloque1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, escribe la carpeta de origen");
        String origen = scan.nextLine();

        System.out.println("Por favor, escribe la carpeta de destino");
        String destino = scan.nextLine();

        System.out.println("Por favor, escribe la extension de los archivos que deseas copiar");
        String tipo = scan.nextLine();

        Path cOrigen = Path.of(origen);
        Path cDestino = Path.of(destino);

        for (Path archivo : Files.list(cOrigen).toList()) {
            if (Files.isRegularFile(archivo) && archivo.getFileName().endsWith(tipo)){
                Path nuevoArchivo = cDestino.resolve(archivo.getFileName());
                Files.copy(archivo, nuevoArchivo);

            }
        }
        scan.close();
    }
}
