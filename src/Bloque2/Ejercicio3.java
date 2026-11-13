package Bloque2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {

        RandomAccessFile fichero = new RandomAccessFile("registros.dat", "rw");

        fichero.seek(48);
        fichero.writeInt(2);

        String nombre = String.format("%-20s", "Pedro");

        for (int i = 0; i < 20; i++) {
            fichero.writeChar(nombre.charAt(i));
        }

        fichero.writeInt(30);
        fichero.close();

    }
}