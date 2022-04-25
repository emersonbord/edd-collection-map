package org.eborda.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {


    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez: peces){
            if (!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);//De unicos elimina todos los que están duplicados
        System.out.println("Únicos: " + unicos);
        System.out.println("Duplicados: " + duplicados);
    }
}
