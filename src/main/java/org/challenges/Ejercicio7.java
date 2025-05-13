package org.challenges;

public class Ejercicio7 {
    public static void main(String[] args){
        Persona persona = new Persona("Pedro", 35);
        persona.saludo();

        if (persona.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor");
        }
    }
}

class Persona{
    String nombre;
    int edad;

    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    void saludo(){
        System.out.println("Hola soy "+nombre+" y tengo "+edad+" gusto en conocerte!");
    }

    boolean esMayorDeEdad(){
        return edad >= 18;
    }
}