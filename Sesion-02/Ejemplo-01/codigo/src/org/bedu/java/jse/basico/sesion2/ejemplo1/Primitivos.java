package org.bedu.java.jse.basico.sesion2.ejemplo1;

public class Primitivos {
    public static void main(String[] args) {

        //Creación de variables y asignación de valores.
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1;

        float valorFloat = 1.5F;
        double valorDouble = 1.5;

        boolean valorBoolean = true;
        char valorChar = 'B';

        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);

        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);

        System.out.println("boolean: " + valorBoolean);
        System.out.println("char: " + valorChar);


        //casteo de valores primitivos
        float numFloat = 1.5f;
        int numInt1 = (int)numFloat;
        System.out.println("numInt1: " + numInt1);

        char numChar = 'M';
        int numInt2 = (int)numChar;
        System.out.println("numInt2: " + numInt2);

        boolean numBool = true;
        //int numInt3 = (int)numBool;


        //Operaciones aritméticas
        System.out.println("valorInt: " + valorInt);
        valorInt = valorInt + 1;
        System.out.println("valorInt: " + valorInt);
        valorInt++;
        System.out.println("valorInt: " + valorInt);

        valorChar++;
        System.out.println("valorChar: " + valorChar);
        valorChar = (char)(valorChar + valorInt);
        System.out.println("valorChar: " + valorChar);
    }
}
