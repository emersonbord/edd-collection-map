package org.eborda.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap2 {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        //método put para guardar, colocamos el nombre y luego el valor
        //Un Map es similar a un objeto persona, donde cada llave corresponde a un atributo 
        //de la clase persona, y cada valor es el valor de ese atributo 
        persona.put(null, "1235");
        //Solo permite 1 null, porque las llaves son únicas
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "GRS");
        persona.put("email", "john.doe@gmail.com");
        persona.put("edad", 30);
        //Creamos HashMap con las direcciones
        Map<String, String> direccion = new HashMap<>();
        direccion.put("Pais", "USA");
        direccion.put("Estado", "California");
        direccion.put("Ciudad", "Santa Barbara");
        direccion.put("Número", "120");

        //Obtener un valor particular con el método get, y pasamos el nombre de la llave get("nombre")
        String nombre = (String)persona.get("nombre");

        //Aignamos dirección a persona
        persona.put("direccion", direccion);
        System.out. println("persona = " + persona);



        //Obtener el mapa de dirección y trabajar en ella
        //Hacemos un cast
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("Pais");
        String ciudad = direccionPersona.get("Ciudad");
        String barrio = direccionPersona.getOrDefault("Barrio", "La playa");
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("La ciudad es " + nombre + " es: " + ciudad);
        System.out.println("El barrio es " + nombre + " es: " + barrio);

        //Método para eliminar
        String valorApellido = (String)persona.remove("apellidoPaterno");
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
        Collection<Object> valores = persona.values();
        //Iteramos los valores
        for (Object v: valores){
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
        for (Map.Entry<String, Object> par: persona.entrySet()){
            Object valor = par.getValue();
            if (valor instanceof Map){
                String nom = (String)persona.get("nombre");
                //Valor del tipo Map hacemos un cast
                Map<String, String> direccionMap = (Map<String, String>) valor;
                //Iterar con un for anidado
                for (Map.Entry<String, String> parDir: direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " =>" + parDir.getValue());
                }
            } else{
                System.out.println(par.getKey() + " => " + valor);
            }

        }

        System.out.println(ANSI_CYAN + "===== keySet =====" + ANSI_RESET);

        //Otra forma
        for (String llave: persona.keySet()){
            Object valor = persona.get(llave);
            if (valor instanceof Map){
                String nom = (String)persona.get("nombre");
                //Valor del tipo Map hacemos un cast
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El país de " + nom + ": "
                + direccionMap.get("pais"));
                System.out.println("La ciudad de " + nom + ": " + direccionMap.get("Estado"));
                System.out.println("La ciudad de " + nom + ": " + direccionMap.get("Ciudad"));
            } else{
                System.out.println(llave + " => " + valor);
            }
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
