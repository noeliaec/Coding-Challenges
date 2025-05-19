package org.challenges;

import java.util.HashMap;

public class Ejercicio15_Estructura_HashMap {
    public static void main(String[] args){
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");

        System.out.println("Traduccion de 'rojo': "+diccionario.get("rojo"));
    }
}
