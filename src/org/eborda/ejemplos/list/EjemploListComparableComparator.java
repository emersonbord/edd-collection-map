package org.eborda.ejemplos.list;

import org.eborda.ejemplos.modelo.Alumno;

import java.util.*;
import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        //HashSet no puede ser iterado con un for clásico porque no posee el método get()
        //Set<Alumno> sa = new HashSet<>();
        List<Alumno> sa = new ArrayList<>();
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

        //Ordenar
        //Collections.sort(sa, (a, b) -> a.getNota().compareTo(a.getNota()));

        //Ordenar por nota, de menor a mayor
        //sa.sort(Comparator.comparing((Alumno a) -> a.getNota()));
        //Ordenar por nombre de forma de Z - A
        //sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());
        //Ordenar por nota de mayor a menor con el método reversed()
        sa.sort(comparing((Alumno a) -> a.getNota()).reversed());

        System.out.println("\n" + ANSI_CYAN +"Iterando usando expresión Lambda y ordenando con sort" + ANSI_RESET);
        sa.forEach(System.out::println);


    }
}
