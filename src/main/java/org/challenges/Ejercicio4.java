package org.challenges;

public class Ejercicio4 {
    public static void main(String[] args){
        String texto = "Playwright es genial";
        int cantidad = contarVocales(texto);
        System.out.print(cantidad);
    }

    public static int contarVocales(String texto){
        int contador = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            }
        }
        return contador;
    }
}
