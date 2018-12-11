package PROG_EJ_10_Excepciones;

public class Operaciones {

    public void suma(int i, int j) {
        System.out.println("Suma numero: " + i + " + " + j + " = " + (i + j));
    }

    public void resta(int i, int j) {
        System.out.println("Resta numero: " + i + " - " + j + " = " + (i - j));
    }

    public void multi(int i, int j) {
        System.out.println("Multiplicacion numero: " + i + " x " + j + " = " + (i * j));
    }

    public void divisFilter(int i, int j) {
        if (j == 0) {
            System.out.println("Error");
        } else {
            System.out.println("Division numero: " + i + " / " + j + " = " + (i / j));
        }
    }

    public void divis(int i, int j) {
        System.out.println("Division numero: " + i + " / " + j + " = " + (i / j));
    }

    public void divisEx(int i, int j)throws ArithmeticException {
        if (j==0){
            throw new ArithmeticException(" div / 0000");
        }else{
            System.out.println("Division numero: " + i + " / " + j + " = " + (i / j));
        }
    }
    public void divisMyEx(int i, int j)throws DividirExeption {
        if (j==0){
            throw new DividirExeption();
        }else{
            System.out.println("Division numero: " + i + " / " + j + " = " + (i / j));
        }
    }

    public void all(int i, int j) {
        suma(i, j);
        resta(i, j);
        multi(i, j);
        try {
            divis(i, j);
        } catch (ArithmeticException e) {
            System.out.println("Error al dividir entre 0");
        }
    }
    public void allNoEx(int i, int j) {
        suma(i, j);
        resta(i, j);
        multi(i, j);
        divis(i, j);
    }
}
