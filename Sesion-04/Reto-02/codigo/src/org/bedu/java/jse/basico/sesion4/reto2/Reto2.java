package org.bedu.java.jse.basico.sesion4.reto2;

public class Reto2 {
    public static void main(String[] args) {
        Llanta llanta1 = new Llanta(205, 16, 35);
        Llanta llanta2 = new Llanta(205, 16, 35);
        Llanta llanta3 = new Llanta(205, 16, 35);
        Llanta llanta4 = new Llanta(205, 16, 35);

        Combustible combustible1 = new Combustible(40, 0);

        Vehiculo vehiculo1 = new Vehiculo(combustible1);
        vehiculo1.colocaLlantas(llanta1, llanta2, llanta3, llanta4);
        vehiculo1.llenaTanque();


        Llanta llanta5 = new Llanta(205, 16, 35);
        Llanta llanta6 = new Llanta(205, 16, 35);
        Llanta llanta7 = new Llanta(205, 16, 35);
        Llanta llanta8 = new Llanta(205, 16, 35);

        Combustible combustible2 = new Combustible(40, 0);

        Vehiculo vehiculo2 = new Vehiculo(combustible2);
        vehiculo2.colocaLlantas(llanta5, llanta6, llanta7, llanta8);
        //vehiculo2.llenaTanque();

        System.out.println(vehiculo1.equals(vehiculo2));
    }
}
