package org.challenges;

public class Ejercicio8_POO_Clase_Producto {
    public static void main(String[] args) {
        Producto producto = new Producto("Mouse", 2000.0, 3);

        System.out.println("Producto: " + producto.nombre);
        System.out.println("Precio: $" + producto.precio);
        System.out.println("Cantidad: " + producto.cantidad);

        double total = producto.calcularTotal();
        System.out.println("Total sin descuento: $ " + total);

        double totalConDescuento = producto.aplicarDescuento(10);
        System.out.println("Total con descuento: $ " + totalConDescuento);
    }
}

class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return precio * cantidad;
    }

    public double aplicarDescuento(double porcentaje) {
        double descuento = calcularTotal() * (porcentaje / 100);
        return calcularTotal() - descuento;
    }
}