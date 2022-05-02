package org.bedu.java.jse.basico.sesion04.ejemplo01;

// import org.bedu.java.jse.basico.sesion04.ejemplo01.defaultma.DemoDefaultExterna;

import org.bedu.java.jse.basico.sesion04.ejemplo01.protectedma2.DemoProtectedExternaHija;
import org.bedu.java.jse.basico.sesion04.ejemplo01.protectedma.DemoProtectedExterna;

public class Main {

    public static void main(String[] args) {

        DemoDefault demoDefault = new DemoDefault();
        demoDefault.metodoPublico();
        demoDefault.metodoDefault();

        // esta clase no puede ser accedida por tener un modificador "default" a nivel de clase y estar en otro package
        /*
        // prueba poniendo el modificar public a nivel clase y después a nivel método
        DemoDefaultExterna demoDefaultExterna = new DemoDefaultExterna();
        demoDefaultExterna.metodoPublico();
        demoDefaultExterna.metodoDefault();
        */

        DemoPrivate demoPrivate = new DemoPrivate();
        demoPrivate.metodoPublico();
        // demoPrivate.metodoPrivado(); // no puede ser accedido fuera de la clase

        DemoProtected demoProtected = new DemoProtected();
        demoProtected.metodoPublico();
        demoProtected.metodoProtected(); // puede ser accedido dentro del mismo package

        DemoProtectedExterna demoProtectedExterna = new DemoProtectedExterna();
        demoProtectedExterna.metodoPublico();
        // demoProtectedExterna.metodoProtected(); // no puede ser accedido al no estar en el mismo package o tener relacion de herencia

        DemoProtectedExternaHija demoProtectedExternaHija = new DemoProtectedExternaHija();
        demoProtectedExternaHija.metodoPublico();
        // demoProtectedExternaHija.metodoProtected(); // no puede ser accedido al no estar en el mismo package o tener relacion de herencia
    }

}
