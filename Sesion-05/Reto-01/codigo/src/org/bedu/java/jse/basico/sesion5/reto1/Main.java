package org.bedu.java.jse.basico.sesion5.reto1;

public class Main {

    public static void main(String[] args) {

        Alumno beto = new Alumno("Beto", 21, "JavaSE003");
        Alumno marina = new Alumno("Marina", 32, "JavaSE003");
        Alumno amber = new Alumno("Beto", 27, "JavaSE003");

        System.out.println(beto);
        System.out.println(beto.getCounter());

        System.out.println(marina);
        System.out.println(marina.getCounter());

        System.out.println(amber);
        System.out.println(amber.getCounter());

        System.out.println(Alumno.getCounter());

    }

}
