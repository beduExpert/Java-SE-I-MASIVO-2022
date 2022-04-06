package org.bedu.java.jse.basico.sesion3.ejemplo2;

import java.util.Scanner;

public class Lector {

    private Scanner scanner = new Scanner(System.in);

    public void muestraMensaje(String mensaje){
        System.out.print(mensaje);
    }

    public String leeEntrada(){
        return scanner.nextLine();
    }
}
