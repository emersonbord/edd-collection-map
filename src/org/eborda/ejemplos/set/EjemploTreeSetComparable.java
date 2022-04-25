package org.eborda.ejemplos.set;

import org.eborda.ejemplos.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {

    public static void main(String[] args) {
        //Set<Alumno> sa = new TreeSet<>((a,b) ->a.getNombre().compareTo(b.getNombre())); //Ordena por nombre alfabeticamente
        //Set<Alumno> sa = new TreeSet<>((a,b) ->b.getNota().compareTo(a.getNota())); //Ordena por nota
        //Instanciando y ordenando por nota de mayor a menor
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNota).reversed());
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrés", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));

        System.out.println(sa);
    }
}
