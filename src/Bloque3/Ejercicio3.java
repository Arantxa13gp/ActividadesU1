
package Bloque3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {

        DataOutputStream salida = new DataOutputStream(
                new FileOutputStream("datos.dat"));

        salida.writeUTF("Ana");
        salida.writeInt(20);
        salida.writeDouble(8.5);

        salida.writeUTF("Carlos");
        salida.writeInt(25);
        salida.writeDouble(7.2);

        salida.close();

        DataInputStream entrada = new DataInputStream(
                new FileInputStream("datos.dat"));

        while (entrada.available() > 0) {

            String nombre = entrada.readUTF();
            int edad = entrada.readInt();
            double nota = entrada.readDouble();

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Nota: " + nota);
        }
        entrada.close();
    }
}
