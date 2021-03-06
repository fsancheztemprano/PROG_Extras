package PROG_Ej_22_Genericos;

import java.util.ArrayList;

/**
 * @author fsancheztemprano
 */
public class NewMain {
    public static void main(String[] args) {
        
        e7();
    }
    /**
     * Sin genericos hace falta castear al tipo apropiado
     */
    static void e1(){
        ClaseObject obx1 = new ClaseObject();
        obx1.setVariable("aaa");
        String str = (String)obx1.getVariable();
        System.out.println(str);
    }
    static void e2(){
        ClaseObject obx1 = new ClaseObject();
        Persona per = new Persona("ana",2000);
        obx1.setVariable(per);
        Persona per2 = (Persona)obx1.getVariable();
    }
    static void e3(){
        ClaseGenerica<String> gen1 = new ClaseGenerica<>();
        gen1.setValor("bbb");
        System.out.println(gen1.getValor());        
    }
    static void e4(){
        ClaseGenerica<Persona> gen1 = new ClaseGenerica<>();
        gen1.setValor(new Persona("ana", 1100));
        System.out.println(gen1.getValor().toString());
    }
    static void e5(){
        ClaseGenerica<Integer> gen1 = new ClaseGenerica<>();
        ArrayList<Integer> listap = new ArrayList<>();
        listap.add(1000);
        listap.add(1009);
        gen1.mostrar(listap);
    }
    static void e6(){
        ClaseGenerica<Persona> gen1 = new ClaseGenerica<>();
        ArrayList<Persona> listap = new ArrayList<>();
        listap.add(new Persona("Ana", 1000));
        listap.add(new Persona("Juan",1009));
        gen1.mostrar(listap);
    }
    static void e7(){
        ClaseGenerica<Persona> gen1 = new ClaseGenerica<>();
        ArrayList<Persona> listap = new ArrayList<>();
        listap.add(new Persona("Ana", 1000));
        listap.add(new Persona("Juan",1009));
        gen1.mostrar(listap);
    }
    static void e8(){
        ClaseGenerica<Persona> gen1 = new ClaseGenerica<>();
        ArrayList<Profesor> listap = new ArrayList<>();
        listap.add(new Profesor("Ana", 1000, "mate"));
        listap.add(new Profesor("Juan",1009, "prog"));
        gen1.ver(listap);
    }
    
}