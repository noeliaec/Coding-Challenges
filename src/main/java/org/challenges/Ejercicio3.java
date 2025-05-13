package org.challenges;

public class Ejercicio3 {
    public static void main (String[] args){
        String palabra = "racecar";
        boolean resultado = esPalindromo(palabra);
        System.out.print(resultado);
    }

    public static boolean esPalindromo(String texto){
        int izquierda = 0;
        int derecha = texto.length() -1;

        while (izquierda < derecha) {
            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;

        }
        return true;
    }
}
