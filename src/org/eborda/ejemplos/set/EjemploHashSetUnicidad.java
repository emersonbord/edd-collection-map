package org.eborda.ejemplos.set;

import org.eborda.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        //HashSet no puede ser iterado con un for clásico porque no posee el método get()
        Set<Alumno> sa = new HashSet<>();
        //ArrayList<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrés", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));

        System.out.println("\n" + ANSI_CYAN + "Iterando con el toString()" + ANSI_RESET);
        System.out.println(sa);
        //Formas de iterar un Set
        System.out.println("\n" + ANSI_CYAN +"Iterando usando un foreach" + ANSI_RESET);
        for (Alumno a: sa){
            //System.out.println(a);
            //imprimir solo con el nombre
            System.out.println(a.getNombre() + " - " +  a.getNota());
        }

        /**System.out.println("\n" + ANSI_CYAN +"Iterando usando un for clásico" + ANSI_RESET);
        for (int i = 0; i<sa.size(); i++){
            System.out.println(sa.get(i));
        }
         */
        System.out.println("\n" + ANSI_CYAN + "Iterando usando while y el iterator" + ANSI_RESET);
        //Todo collection tiene un Iterator
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){ //Mientras tenga un siguiente elemento hasNext(), iteramos
            //Obtenemos el alumno, luego movemos el cursor con next()
            Alumno a = it.next();
            System.out.println(a);
        }

        System.out.println("\n" + ANSI_CYAN +"Iterando utilizando expresión Lambda" + ANSI_RESET);
        sa.forEach(a -> System.out.println(a.getNombre()));
    }
}
