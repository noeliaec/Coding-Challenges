package org.challenges;

public class Ejercicio5_Estructura_Array_Suma {
    public static void main(String[] args){
        int[] numeros = {1, 3, 5, 6, 9, 11};
        int suma = 0;

        for ( int i = 0; i < numeros.length; i++){
            if (numeros[i] % 3 == 0){
                suma += numeros[i];

            }
        }
        System.out.print(suma);
    }
}
