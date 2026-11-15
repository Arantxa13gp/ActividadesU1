package Bloque4.Ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args)throws IOException {
        List<Producto> productos = Arrays.asList(
                new Producto(1, "Teclado Mecánico", 59.99),
                new Producto(2, "Ratón Inalámbrico", 24.50),
                new Producto(3, "Monitor 24 pulgadas", 149.00)
        );

        BufferedWriter bw = new BufferedWriter(new FileWriter("productos.csv"));
        bw.write("ID;Nombre;Precio");
        bw.newLine();

        for (Producto p : productos){
            bw.write(p.toCSV());
            bw.newLine();
        }
    }
}
