package org.challenges;

import java.util.*;
public class Ejercicio17 {
    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();

        autos.add(new Auto("Fiat", "Chronos", 2023, 4, new Motor("Nafta", 1.6)));
        autos.add(new Auto("Ford", "Focus", 2019, 4, new Motor("Diesel", 2.0)));
        autos.add(new Auto("Toyota", "Yaris", 2021, 5, new Motor("Mafta", 1.3)));

        System.out.println("Autos Fiat, nuevos y con motor naftero:");
        for (Auto auto : autos) {
            if (auto.esFiat() && auto.esNuevo() && auto.motor.esNafta()) {
                auto.mostrarDetalles();
                System.out.println("--------------------------------");
            }
        }
        //Hashmap de precios
        Map<String, Double> precios = new HashMap<>();

        precios.put("Chronos", 3200000.0);
        precios.put("Focus", 4500000.0);
        precios.put("Yaris", 3900000.0);

        System.out.println("Precios del Chronos: $"+precios.get("Chronos"));

        //Set de marcas unicas
        Set<String> marcas = new HashSet<>();
        for (Auto auto : autos){
            marcas.add(auto.marca);
        }

        System.out.println("\nMarcas disponibles: ");
        for (String marca : marcas){
            System.out.println("- "+marca);
        }
    }
}