package org.challenges;

import java.util.HashMap;

public class Ejercicio15_Estructura_HashMap_Productos {
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<>();

        //Agrega productos
        productos.put("Jabon", 850.0);
        productos.put("Detergente", 850.0);
        productos.put("Suavizante", 850.0);

        System.out.println("Precio del jabon: $" + productos.get("Jabon"));

        //Busca productos
        if (productos.containsKey("Detergente")) {
            System.out.println("Tenemos detergente en el sistema");
        }

        //Elimina productos
        productos.remove("Suavizante");
        System.out.println("Suavizante eliminado\n");

        //Recorre el hashmap
        System.out.println("Lista de productos: ");
        for (String nombre : productos.keySet()){
            double precio = productos.get(nombre);
            System.out.println("- "+nombre+": $"+precio);
        }

    }
}
