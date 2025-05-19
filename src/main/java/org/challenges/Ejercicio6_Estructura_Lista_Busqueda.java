package org.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6_Estructura_Lista_Busqueda {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.addAll(List.of("Lucas", "Noe", "Pollito", "Ana"));

        Scanner scanner = new Scanner(System.in);
        String nombresBuscado = scanner.nextLine().toLowerCase();

        boolean encontrado = false;

        for (String nombre : nombres) {
            if (nombre.toLowerCase().equals(nombresBuscado)) {
                encontrado = true;
                break;
            }
        }
        System.out.print(encontrado);
    }
}
