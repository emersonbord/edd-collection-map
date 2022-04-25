package org.eborda.ejemplos.set;

import org.eborda.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        //Trabajar con pilas o colas es mejor trabajar con linkedlist
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Está vacía = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andrés", 3));
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Está vacía = " + enlazada.isEmpty());

        //ES IMPORTANTE QUE PARA ELIMINAR DEBEMOS TENER IMPLEMENTADO EL MÉTODO EQUALS EN NUESTRA CLASE ALUMNO
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Socrates", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero = " + enlazada.getFirst());
        System.out.println("Último = " + enlazada.getLast());
        System.out.println("índice 2 = " + enlazada.get(2));

        enlazada.removeFirst(); //Puede ser con pop(), pollFirst() o poll() que tambien elimina
        enlazada.pollLast();

        System.out.println(enlazada + ", size = " + enlazada.size());

        //Eliminar el objeto mediante el índice o mediante la misma instancia
        //remove() a secas elimina el primero, es como removeFirst()
        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);
        //Devolver el índice
        System.out.println("Índice de Lucas = " + enlazada.indexOf(a));

        //Eliminar por el índice
        enlazada.remove(2);
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Índice de Lucas = " + enlazada.indexOf(a));

        //Para modificar, reemplazamos el índice 3 por lalo
        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());


    }
}
