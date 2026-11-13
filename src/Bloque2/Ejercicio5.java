package Bloque2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
        RandomAccessFile fichero = new RandomAccessFile("datos.dat", "rw");

        fichero.seek(fichero.length());

        fichero.writeInt(1);
        fichero.writeInt(20);

        fichero.writeInt(2);
        fichero.writeInt(25);

        fichero.seek(8);

        fichero.writeInt(2);
        fichero.writeInt(30);

        fichero.seek(8);

        fichero.writeInt(-1);
        fichero.writeInt(0);

        fichero.close();
    }
}