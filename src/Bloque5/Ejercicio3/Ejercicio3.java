package Bloque5.Ejercicio3;

import java.io.*;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String archivoDat = "C:\\Users\\Admin\\IdeaProjects\\ActividadesU1\\alumnos.dat";
        String archivoCsv = "alumnos_exportados.csv";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoDat));
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCsv));

        List<Alumno> alumnos = (List<Alumno>) ois.readObject();
        bw.write("Id;Nombre;Nota");
        bw.newLine();

        for (Alumno a : alumnos) {
            bw.write(a.toCSV());
            bw.newLine();
        }
        ois.close();
        bw.close();
    }
}
