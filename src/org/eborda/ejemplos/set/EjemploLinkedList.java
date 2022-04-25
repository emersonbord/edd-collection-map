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


    }
}
