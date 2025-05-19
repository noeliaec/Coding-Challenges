package org.challenges;

public class Ejercicio2_Estructura_Array {
    public static void main(String[] args){
        int[] numeros = {2, 34, 56, 12, 5};
        int maximo = encontrarNumeroMaximo(numeros);
        System.out.print(maximo);
    }

    public static int encontrarNumeroMaximo(int[] arreglo){
        int max = arreglo[0];

        for (int i = 1; i< arreglo.length; i++){
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
        }
        return max;
    }
}
