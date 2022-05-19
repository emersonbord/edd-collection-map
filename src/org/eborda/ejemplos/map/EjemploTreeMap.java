package org.eborda.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        //Map<String, Object> persona = new TreeMap<>((a,b) -> b.compareTo(a));
        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
        //Ordenar por el largo del String
        //Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length));
        //No pueden existir elementos nulos en TreeMap
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "GRS");
        persona.put("email", "john.doe@gmail.com");
        persona.put("edad", 30);
        //Creamos HashMap con las direcciones
        Map<String, String> direccion = new TreeMap<>();
        direccion.put("Pais", "USA");
        direccion.put("Estado", "California");
        direccion.put("Ciudad", "Santa Barbara");
        direccion.put("Número", "120");

        //Aignamos dirección a persona
        persona.put("direccion", direccion);

        System.out.println("Persona = " + persona);

    }
}
