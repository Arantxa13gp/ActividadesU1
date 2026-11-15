package Bloque4;

import java.io.*;

public class Ejercicio2 {

    public static void main(String[] args) throws IOException {
        String archivo = "registros.bin";

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivo));

        dos.writeUTF("Carlos");
        dos.writeInt(28);
        dos.writeDouble(1850.75);

        dos.writeUTF("Elena");
        dos.writeInt(34);
        dos.writeDouble(2300.00);

        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream(archivo));

        System.out.println("\nLeyendo registros:");

        while (dis.available() > 0) {
            String nombre = dis.readUTF();
            int edad = dis.readInt();
            double salario = dis.readDouble();
            System.out.printf("Nombre:" + nombre +  " | Edad: " + edad + " | Salario:" + salario + "\n");
        }
        dis.close();
    }
}
