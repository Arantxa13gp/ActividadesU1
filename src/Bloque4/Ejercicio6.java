package Bloque4;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Ejercicio6 {

    public static void main(String[] args) throws IOException {
        String archivoGzip = "datos_comprimidos.dat.gz";

        DataOutputStream dos = new DataOutputStream(
                new GZIPOutputStream(
                        new FileOutputStream(archivoGzip)));

        for (int i = 1; i <= 1000; i++) {
            dos.writeInt(i);
            dos.writeUTF("Registro repetitivo número " + i);
        }

        dos.close();
        System.out.println("Datos binarios comprimidos guardados en " + archivoGzip);

        DataInputStream dis = new DataInputStream(
                new GZIPInputStream(
                        new FileInputStream(archivoGzip)));

        for (int i = 0; i < 3; i++) {
            System.out.println(dis.readInt() + " -> " + dis.readUTF());
        }
        dis.close();
    }
}
