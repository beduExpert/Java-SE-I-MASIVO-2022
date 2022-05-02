package org.bedu.java.jse.basico.sesion04.ejemplo01.defaultma;

// observa que hemos eliminado el modificador de acceso "public" a nivel clase
class DemoDefaultExterna {

    // observa que hemos eliminado el modificador de acceso a nivel método
    void metodoDefault() {
        System.out.println("[DemoDefaultExterna] método default");
    }

    public void metodoPublico() {
        System.out.println("[DemoDefaultExterna] método público");
    }
}
