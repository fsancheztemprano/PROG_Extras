package PROG_Ej_18_FicheroSerializable;

/**
 * @author fsancheztemprano
 */
public class Main {

    public static void main(String[] args) {

        EscribirSerializable es = new EscribirSerializable();
        es.escribirObjeto("alumno");

        LecturaSerializable ls = new LecturaSerializable();
        ls.leerObjeto("alumno");

        es.agregarObjetos("alumno");

        ls.leerObjeto("alumno");
        //

    }
}
