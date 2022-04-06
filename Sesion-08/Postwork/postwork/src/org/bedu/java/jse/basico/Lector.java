package org.bedu.java.jse.basico;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leeOpcion(){
        System.out.print("Opción: ");
        return scanner.nextByte();
    }

    public String leeCadena(){
        System.out.print("Cadena: ");
        return scanner.nextLine();
    }
}
