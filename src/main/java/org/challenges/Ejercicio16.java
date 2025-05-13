package org.challenges;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio16 {
    public static void main(String[] args){
        Set<String> frutas = new HashSet<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Banana");

        //No imprime duplicados
        System.out.println("Frutas disponibles:");
        for (String fruta : frutas){
            System.out.println("- "+fruta);
        }
    }
}