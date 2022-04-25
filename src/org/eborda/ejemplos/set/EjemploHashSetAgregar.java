package org.eborda.ejemplos.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {

        System.out.println("======= HashMap =======");
        //No permite duplicar datos, por ende, no los agrega, y agrega datos de manera aleatorea, sin ordenar
        Set<String> hs = new HashSet<>();
        hs.add("Uno");
        hs.add("Dos");
        hs.add("Tres");
        hs.add("Cuatro");
        hs.add("Cinco");
        System.out.println(hs);

        boolean bo = hs.add("Tres");
        System.out.println("Permite elementos duplicados?: " + bo);
        System.out.println(hs);

        System.out.println("======= ArrayList =======");
        //Permite duplicar datos, por ende, los agrega, y agrega datos de manera ordenada
        List<String> al = new ArrayList<>();
        al.add("Uno");
        al.add("Dos");
        al.add("Tres");
        al.add("Cuatro");
        al.add("Cinco");
        System.out.println(al);

        boolean bo2 = al.add("Tres");
        System.out.println("Permite elementos duplicados?: " + bo2);
        System.out.println(al);

    }
}
