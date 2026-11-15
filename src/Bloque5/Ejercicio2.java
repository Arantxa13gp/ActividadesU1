package Bloque5;

import java.io.*;
import java.util.Locale;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        String archivoBin = "C:\\Users\\Admin\\IdeaProjects\\ActividadesU1\\indice.dat";
        String archivoTxt = "productos_exportados.txt";

        DataInputStream dis = new DataInputStream(new FileInputStream(archivoBin));
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTxt));
        bw.write("Listado de productos");
        bw.newLine();

        while (true) {
            int id = dis.readInt();
            String nombre = dis.readUTF();
            double precio = dis.readDouble();

            String linea = String.format(Locale.US, "ID: " + id + " | Producto: " + nombre + " | Precio: " + precio + "\n");
            bw.write(linea);
            bw.newLine();

            bw.close();
            dis.close();
        }
    }
}