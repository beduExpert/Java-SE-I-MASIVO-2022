package org.bedu.java.jse.basico.sesion01.tarea;

public class OrientacionObjetos {

    public static void main(String[] args) {

        Address direccion = new Address();
        direccion.setCalle("Córdoba,  Ciudad de México, CDMX, Mexico");
        direccion.setExterior("56");
        direccion.setColonia("Roma Nte.");
        direccion.setAlcaldia("Cuauhtémoc");
        direccion.setCodigoPostal("06700");

        Persona beto = new Persona();
        beto.setPrimerNombre("Beto");
        beto.setPrimerApellido("Bedu");
        beto.setDireccion(direccion);

        System.out.println(beto);
    }
}
