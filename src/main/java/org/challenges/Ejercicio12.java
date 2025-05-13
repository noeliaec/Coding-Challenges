package org.challenges;

public class Ejercicio12 {
    public static void main(String[] args) {
        Auto auto = new Auto("Fiat", "Chronos", 2023, 4, new Motor("Nafta", 1.6));

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
    Motor motor;
    public Auto(String marca, String modelo, int anio, int puertas, Motor motor){
        super(marca, modelo, anio);
        this.puertas = puertas;
        this.motor = motor;
    }

    @Override
    void mostrarDetalles(){
        System.out.println("Informacion del vehiculo: " +
                "\nMarca: "+marca+
                "\nModelo: "+modelo+
                "\nAño: "+anio+
                "\nPuertas: "+puertas
        );
        motor.mostrarMotor();
    }

    boolean esNuevo() {
        return anio >= 2020;
    }

    boolean esFiat(){
        return marca.equals("Fiat");
    }

    boolean tiene4puertas(){
        return puertas == 4;
    }
}