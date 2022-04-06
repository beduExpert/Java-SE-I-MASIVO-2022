package org.bedu.java.jse.basico.sesion8.ejemplo3;

import java.time.LocalDate;
import java.time.Month;

public class Formato {
    public static void main(String[] args) {

        final String NOMBRE = "Beto";
        final int EDAD = 23;
        final float PROMEDIO = 8.4F;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of(1996, Month.FEBRUARY, 21);

        System.out.println("Mi nombre es " + NOMBRE + ", tengo " + EDAD + " años, mi promedio es de " + PROMEDIO + " y nací el día " + FECHA_NACIMIENTO);

        System.out.printf("Mi nombre es %s, tengo %d años, mi promedio es de %f y nací el día %4$tb %4$te, %4$ty\n", NOMBRE, EDAD, PROMEDIO, FECHA_NACIMIENTO);

        System.out.println(String.format("Mi nombre es |%8s|, tengo %05d años, mi promedio es de %.2f y nací el día %4$te de %4$tB de %4$tY", NOMBRE, EDAD, PROMEDIO, FECHA_NACIMIENTO));

        System.out.printf("Mi nombre es |%-8s|%n tengo %d años %n mi promedio es de %.2f%n y nací el día %4$td %4$tb, %4$tY", NOMBRE, EDAD, PROMEDIO, FECHA_NACIMIENTO);
    }
}
