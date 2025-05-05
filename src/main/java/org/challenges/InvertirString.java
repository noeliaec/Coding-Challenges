package org.challenges;

public class InvertirString{
    public static void main (String[] arg) {
        String original = "Playwrigth";
        String invertido = stringInvertido(original);
        System.out.print(invertido);
    }

    public static String stringInvertido(String texto){
        String resultado = "";

        for (int i = texto.length() -1; i>= 0; i--){
            resultado += texto.charAt(i);
        }
        return resultado;
    }
}


