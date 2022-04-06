package org.bedu.java.jse.basico.sesion2.reto1;

public class Reto1 {
    public static void main(String[] args) {
        byte valorByte = Byte.MAX_VALUE;
        System.out.println(valorByte);

        valorByte += 1;
        System.out.println(valorByte);

        valorByte = Byte.MIN_VALUE;
        System.out.println(valorByte);
        valorByte -= 1;
        System.out.println(valorByte);
    }
}
