package org.bedu.java.jse.basico.sesion3.reto2;

public class Composicion {

    public static void main(String[] args) {
        Llanta llanta1 = new Llanta();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPresion(35);

        Llanta llanta2 = new Llanta();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPresion(35);

        Llanta llanta3 = new Llanta();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPresion(35);

        Llanta llanta4 = new Llanta();
        llanta1.setAncho(205);
        llanta1.setDiametro(16);
        llanta1.setPresion(35);

        Combustible combustible = new Combustible();
        combustible.setLitrosActuales((short) 0);
        combustible.setLitrosMaximos((short) 40);

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setCombustible(combustible);
        vehiculo.colocaLlantas(llanta1, llanta2, llanta3, llanta4);
        vehiculo.llenaTanque();

        for (int i = 1; i <= 5; i++) {
            vehiculo.avanza();
        }
    }
}
