package org.eborda.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    //TreeSet son set ordenados de forma natural, si son alfabeticas, si son cadenas o String, dependiendo de la regla de ordenamiento que le demos
    //TreeSet tienen costo de rendimiento porque son ordenados, tiene su costo para eliminar o para agregar porque tiene que ir ordenando sus posiciones
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>((a,b)->b.compareTo(a));
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        //Ordena de manera alfabeticamente
        System.out.println("ts = " + ts);

        //Ordena de forma numérica de menor a mayor, sin invocar ningún sort.
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        System.out.println("numeros = " + numeros);
    }
}
