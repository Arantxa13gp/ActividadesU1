package Bloque2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio4 {

    public static void main(String[] args) throws IOException {
        RandomAccessFile fichero = new RandomAccessFile("registros.dat", "rw");
        for (int i = 0; i < 10000; i++) {

            fichero.writeInt(i);
            fichero.writeInt(i + 20);
        }

        long inicio = System.nanoTime();
        fichero.seek(0);
        for (int i = 0; i < 10000; i++) {

            fichero.readInt();
            fichero.readInt();
        }

        long fin = System.nanoTime();

        System.out.println("Tiempo lectura secuencial: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();

        for (int i = 0; i < 10000; i++) {

            fichero.seek(i * 8);

            fichero.readInt();
            fichero.readInt();
        }

        fin = System.nanoTime();

        System.out.println("Tiempo lectura aleatoria: " + (fin - inicio) + " ns");
        fichero.close();
    }
}