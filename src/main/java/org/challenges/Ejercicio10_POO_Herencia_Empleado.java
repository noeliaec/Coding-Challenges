package org.challenges;

public class Ejercicio10_POO_Herencia_Empleado {
    public static void main(String[] args){
        Empleado empleado = new Empleado("Noe", 35, 1500, 750);

        empleado.saludo();
        empleado.mostarDatos();

        System.out.println("Sueldo total: "+empleado.calcularSueldoTotal());

        if (empleado.tieneBono()){
            System.out.println("El empleado tiene bono asignado");
        } else {
            System.out.println("El empleado no tiene bono");
        }
    }
}

class Empleado extends Persona {
    double sueldoBase;
    double bono;

    public Empleado(String nombre, int edad, double sueldoBase, double bono) {
        super(nombre, edad);
        this.sueldoBase = sueldoBase;
        this.bono = bono;
    }

    void mostarDatos() {
        System.out.println("Empleado: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Sueldo Base: "+sueldoBase);
        System.out.println("Bono: "+bono);
    }

    double calcularSueldoTotal(){
        return sueldoBase + bono;
    }

    boolean tieneBono(){
        return bono > 0;
    }
}
