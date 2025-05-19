package org.challenges;

import java.util.ArrayList;

public class Ejercicio13_Coleccion_ArrayList_Filtros {
    public static void main(String[] args){
        ArrayList<Auto> autos = new ArrayList<>();

        autos.add(new Auto("Fiat", "Chronos", 2023, 4, new Motor("Nafta", 1.6)));
        autos.add(new Auto("Toyota", "Corola", 2020, 4, new Motor("Nafta", 2.0)));
        autos.add(new Auto("Fort", "Ka", 2018, 5, new Motor("Diesel", 1.4)));

        for (Auto auto : autos) {
            if (auto.esNuevo() && auto.esFiat() && auto.tiene4puertas()) {
                auto.mostrarDetalles();
                System.out.println("------------------------------");
            }
        }
    }
}