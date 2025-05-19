package org.challenges;

import java.util.Stack;

public class Ejercicio19_Estructura_Stack_Vidas {
    public static void main(String[] args) {
    Stack <String> vidas = new Stack();
    String vida = " ❤️ ";

        for (int i = 0; i < 3; i++){
            vidas.push(vida);
            System.out.print(vida);
        }
        System.out.println("\n----------------------------------");

        String[] golpes = {"🪓","🪓","🪓"};

        for (String golpe : golpes){
            if (!vidas.isEmpty()){
                System.out.println("Recibiste un golpe "+golpe+"! Perdes una vida!");
                vidas.pop();
            } else {
                System.out.println("Ya no te queda ninguna vida 💀");
            }
            System.out.println("Vidas: ");
            for (String v : vidas){
                System.out.print(v);
            }
            System.out.println("\n----------------------------------");
        }

        if (vidas.isEmpty()){
            System.out.println("GAME OVER!");
        }
    }
}