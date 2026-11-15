package Bloque5;

import java.io.*;
import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) throws IOException {
        String archivoCsv = "C:\\Users\\Admin\\IdeaProjects\\ActividadesU1\\src\\Bloque5\\productos.csv";
        String archivoBin = "productos.bin";

        BufferedReader br = new BufferedReader(new FileReader(archivoCsv));
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivoBin));

        String linea = br.readLine();

        while ((linea = br.readLine()) != null) {
            if (linea.trim().isEmpty()) continue;

            String[] campos = linea.split(";");
            int id = Integer.parseInt(campos[0].trim());
            String nombre = campos[1].trim();
            double precio = Double.parseDouble(campos[2].trim().replace(",", "."));

            dos.writeInt(id);
            dos.writeUTF(nombre);
            dos.writeDouble(precio);
        }
    }
}
