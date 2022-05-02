package org.bedu.java.jse.basico.sesion04.ejemplo01.protectedma2;

import org.bedu.java.jse.basico.sesion04.ejemplo01.protectedma.DemoProtectedExterna;

public class DemoProtectedExternaHija extends DemoProtectedExterna {

    protected void metodoProtected(){
        System.out.print("[DemoProtectedExternaHija] accediendo a método protegido fuera del package ...");
        super.metodoProtected(); // aquí podemos acceder por tener una relación de herencia
    }

    public void metodoPublico(){
        System.out.print("[DemoProtectedExternaHija] método público");
        this.metodoProtected();
    }
}
