package org.bedu.java.jse.basico.sesion5.ejemplo1;

public class MiembrosEstaticos {
    public static void main(String[] args) {
        Contador cont1 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());

        Contador cont2 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());

        Contador cont3 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());

        Contador cont4 = new Contador();
        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());


//        System.out.println("cont1.contadorInstancia: " + cont1.getContadorInstancia());
//        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());
//        System.out.println();
//        System.out.println("cont4.contadorInstancia: " + cont4.getContadorInstancia());
//        System.out.println("Contador.contadorClase: " + Contador.getContadorClase());
    }
}
