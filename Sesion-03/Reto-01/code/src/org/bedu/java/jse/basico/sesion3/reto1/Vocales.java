package org.bedu.java.jse.basico.sesion3.reto1;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe la palabra que se analizará: ");

        String palabra = scanner.nextLine();

        int conteoVocales = 0;

        for (char caracter : palabra.toLowerCase().toCharArray()) {

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                conteoVocales++;
            }
        }

        System.out.println(palabra + ": " + conteoVocales);
    }
}
