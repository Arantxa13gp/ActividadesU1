package Bloque2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio6 {

    public static void main(String[] args) throws IOException {
        RandomAccessFile fichero = new RandomAccessFile("datos.dat", "rw");
        RandomAccessFile indice = new RandomAccessFile("indice.dat", "rw");

        fichero.writeInt(1);
        fichero.writeInt(20);

        fichero.writeInt(2);
        fichero.writeInt(25);

        fichero.writeInt(3);
        fichero.writeInt(30);

        indice.setLength(0);

        for (int i = 0; i < 3; i++) {

            long posicion = i * 8;

            fichero.seek(posicion);

            int id = fichero.readInt();

            indice.writeInt(id);
            indice.writeLong(posicion);
        }

        indice.seek(0);

        for (int i = 0; i < 3; i++) {

            int id = indice.readInt();
            long posicion = indice.readLong();

            if (id == 2) {

                fichero.seek(posicion);

                System.out.println("ID: " + fichero.readInt());
                System.out.println("Edad: " + fichero.readInt());

                break;
            }
        }

        fichero.close();
        indice.close();
    }
}