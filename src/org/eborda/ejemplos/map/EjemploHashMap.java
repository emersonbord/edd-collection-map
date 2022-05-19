package org.eborda.ejemplos.map;

import java.util.*;

public class EjemploHashMap {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        //método put para guardar, colocamos el nombre y luego el valor
        //Un Map es similar a un objeto persona, donde cada llave corresponde a un atributo 
        //de la clase persona, y cada valor es el valor de ese atributo 
        persona.put(null, "1235");
        //Solo permite 1 null, porque las llaves son únicas
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "GRS");
        persona.put("email", "john.doe@gmail.com");
        persona.put("edad", "30");

        System.out. println("persona = " + persona);

        //Obtener un valor particular con el método get, y pasamos el nombre de la llave get("nombre")
        String nombre = persona.get("nombre");

        //Método para eliminar
        String valorApellido = persona.remove("apellidoPaterno");
        //boolean b = persona.remove("apellidoPaterno", "GRS");
        System.out.println("Valor eliminado: "+ valorApellido);
        System.out.println("======Imprimir valores actualizados=====");
        System.out.println("Persona: " + persona);

        //Método contains
        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("Existe: " + b2);

        b2 = persona.containsValue("John");
        System.out.println("Existe: " + b2);

        System.out.println(ANSI_CYAN + "===== values =====" + ANSI_RESET);
        //Método values
        Collection<String> valores = persona.values();
        //Iteramos los valores
        for (String v: valores){
            System.out.println("Valores: " + v);
        }

        System.out.println(ANSI_CYAN + "===== keySet =====" + ANSI_RESET);

        //Método keySet() obtengo un set con los valores de las llaves
        Set<String> llaves = persona.keySet();
        //Iteramos con un for
        for (String k: llaves){
            System.out.println("Llaves: " + k);
        }

        System.out.println(ANSI_CYAN + "===== entrySet =====" + ANSI_RESET);

        //Iterar en conjunto llaves y valores
        for (Map.Entry<String, String> par: persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getKey());
        }

        System.out.println(ANSI_CYAN + "===== ekeySet =====" + ANSI_RESET);

        //Otra forma
        for (String llave: persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        System.out.println(ANSI_CYAN + "===== Java 8 forEach =====" + ANSI_RESET);

        persona.forEach((llave,valor) ->{
            System.out.println(llave + " => " + valor);
        });


        System.out.println("Total: " + persona.size());
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        persona.replace("nombre", "Emerson");
        System.out.println("persona = " + persona);
    }
}
