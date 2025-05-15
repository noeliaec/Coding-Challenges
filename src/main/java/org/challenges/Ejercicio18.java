package org.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio18 {
    public static void main(String[]  args) {
        ArrayList<Celular> celulares = new ArrayList<>();

        celulares.add(new Celular("Samsung", "S24", 2022, 6.5, new Bateria(4500, "Li-Ion")));
        celulares.add(new Celular("Samsung", "S23", 2020, 6.5, new Bateria(4500, "Li-Ion"))); // mismo tamaño de pantalla y batería que el S24
        celulares.add(new Celular("Motorola", "Edge 20", 2021, 6.7, new Bateria(5000, "Li-Po")));
        celulares.add(new Celular("Samsung", "S24", 2022, 6.5, new Bateria(4500, "Li-Ion"))); // duplicado exacto
        celulares.add(new Celular("Xiaomi", "Redmi Note 10", 2022, 6.5, new Bateria(4500, "Li-Ion"))); // misma pantalla y batería
        celulares.add(new Celular("Samsung", "A12", 2021, 6.5, new Bateria(4000, "Li-Ion"))); // mismo tamaño de pantalla
        celulares.add(new Celular("Samsung", "S24", 2022, 6.5, new Bateria(4500, "Li-Ion"))); // otro duplicado
        celulares.add(new Celular("Samsung", "S22", 2022, 6.5, new Bateria(4500, "Li-Ion"))); // mismo todo excepto modelo

        System.out.println("Celulares Samsung: ");
        for (Celular celular : celulares){
            if (celular.esSamsung()){
                celular.mostrarInformacion();
            }
        }

        System.out.println("\nBaterias de gran capacidad: ");
        for (Celular celular : celulares){
            if (celular.bateria.mejorBateria()){
                celular.mostrarInformacion();
            }
        }

        System.out.println("\nCelulares Nuevos: ");
        for (Celular celular : celulares){
            if (celular.esNuevo()){
                celular.mostrarInformacion();
            }
        }

        System.out.println("\nMejor celular: ");
        for (Celular celular : celulares){
            if (celular.esSamsung() && celular.bateria.mayorBateria() && celular.esNuevo()){
                celular.mostrarInformacion();
            }
        }

        HashMap<String, Double> precios = new HashMap<>();

        precios.put("S24", 650000.0);
        precios.put("S23", 580000.0);
        precios.put("S22", 530000.0);
        precios.put("A12", 410000.0);
        precios.put("Edge 20", 480000.0);
        precios.put("Redmi Note 10", 450000.0);

        Set<String> marcas = new HashSet<>();
        for (Celular celular : celulares){
            marcas.add(celular.marca);
        }

        System.out.println("\nMarcas disponibles: ");
        for (String marca : marcas){
            System.out.println("- "+marca);
        }
    }
}

class Dispositivo {
    String marca;
    String modelo;
    int anio;

    public Dispositivo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    boolean esSamsung(){
        return marca.equalsIgnoreCase("Samsung");
    }

    boolean esNuevo(){
        return anio > 2021;
    }
}

class Celular extends Dispositivo {

    double pantalla;
    Bateria bateria;
    public Celular(String marca, String modelo, int anio, double pantalla, Bateria bateria) {
        super(marca, modelo, anio);
        this.pantalla = pantalla;
        this.bateria = bateria;
    }

    void mostrarInformacion(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+anio);
        System.out.println("Pantalla: "+pantalla+" pulgadas");
        System.out.println("Bateria: "+bateria.infoBateria());
        System.out.println("--------------------------------------");
    }
}

class Bateria{
    double capacidad;
    String tipo;

    public Bateria(double capacidad, String tipo){
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    String infoBateria(){
        return capacidad +" mAh - "+tipo;
    }

    boolean mayorBateria(){
        return capacidad >=4500;
    }
    boolean mejorBateria(){
        return capacidad >=5000;
    }
}