package org.challenges;

public class HerenciaOverride2 {
    public static void main(String[] args) {
        Auto auto = new Auto("Fiat", "Chronos", 2023, 4);

        auto.mostrarDetalles();
    }
}

class Vehiculo{
    String marca;
    String modelo;
    int anio;

    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    void mostrarDetalles(){
        System.out.println("Informacion del vehiculo: " +
                "\nMarca: "+marca+
                "\nModelo: "+modelo+
                "\nAño: "+anio
        );
    }
}

class Auto extends Vehiculo{
    int puertas;
    public Auto(String marca, String modelo, int anio, int puertas){
        super(marca, modelo, anio);
        this.puertas = puertas;
    }

    @Override
    void mostrarDetalles(){
        System.out.println("Informacion del vehiculo: " +
                "\nMarca: "+marca+
                "\nModelo: "+modelo+
                "\nAño: "+anio+
                "\nPuertas: "+puertas
        );
    }
}