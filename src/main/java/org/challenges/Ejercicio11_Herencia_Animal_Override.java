package org.challenges;

public class Ejercicio11_Herencia_Animal_Override {
    public static void main(String[] args){
        Perro perro = new Perro("Firulais", 5);
        Gato gato = new Gato("Michi", 3);

        System.out.println("Datos del perro: ");
        perro.mostrarInfo();
        perro.hacerSonido();

        System.out.println("Datos del gato: ");
        gato.mostrarInfo();
        gato.hacerSonido();
    }
}

class Animal{
    String nombre;
    int edad;

    public Animal (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    void hacerSonido(){
        System.out.println("Este aminal hace un sonido...");
    }

    void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad+" años");
    }
}

class Perro extends Animal{
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }
    @Override
    void hacerSonido(){
        System.out.println("Guau! Guau!");
    }
}

class Gato extends Animal{
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    void hacerSonido(){
        System.out.println("Miau! Miau!");
    }
}
