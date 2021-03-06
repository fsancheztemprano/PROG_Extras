package PROG_Ej_18_FicheroSerializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author fsancheztemprano
 */
public class LecturaSerializable {

    ObjectInputStream read;
    FileInputStream file;
    Alumno al;

    public ArrayList<Alumno> leerObjeto(String filename) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        boolean x = true;
        try {
            file = new FileInputStream(filename + ".dat");
            read = new ObjectInputStream(file);

            while (file.available() != 0) {
                Alumno alumno = (Alumno) read.readObject();
                alumnos.add(alumno);
                System.out.println(alumno);
            }
            System.out.println(alumnos);

        } catch (ClassNotFoundException | FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        } finally {
            try {
                file.close();
                read.close();
            } catch (IOException ex) {
                System.out.println("IOException");
            }
        }
        return alumnos;
    }

}
