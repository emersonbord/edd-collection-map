package org.eborda.ejemplos.list;

import org.eborda.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploArrayList {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("Está vacía = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(new Alumno("Jano", 7));
        al.add(new Alumno("Andrés", 3));
        System.out.println(al + ", size = " + al.size());
        System.out.println("Está vacía = " + al.isEmpty());

        //ES IMPORTANTE QUE PARA ELIMINAR DEBEMOS TENER IMPLEMENTADO EL MÉTODO EQUALS EN NUESTRA CLASE ALUMNO
        //Eliminar con el método remove por instancia
        al.remove(new Alumno("Jano", 7));
        System.out.println(al + ", size = " + al.size());

        //Código para comprobar si contiene a algún alumno
        boolean b = al.contains(new Alumno("Jano", 7));
        if (!b){ //b == false
            String negativo = "No lo contiene";
            System.out.println(negativo);
        }else {
            String positivo = "Si lo contiene";
            System.out.println(positivo);
        }

        //Convertir esta lista ArrayList en un arreglo
        System.out.println("\n" + "========= Desde un arreglo =======");
        Object a[] = al.toArray();
        //Iteramos para poder mostrar "imprimir los resultados"
        for (int i = 0; i<a.length;i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }
    }
}
