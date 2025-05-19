package org.challenges;

class Motor{
    String tipo;
    Double cilindrada;

    public Motor(String tipo, double cilindrada) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }

    void mostrarMotor(){
        System.out.println("Motor: "+tipo+" - "+cilindrada);
    }

    boolean esNafta() {
        return tipo.equalsIgnoreCase("Nafta");
    }
}