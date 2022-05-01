package org.bedu.java.jse.basico.sesion02.tarea;

public class Primos {

    public boolean esPrimo(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
