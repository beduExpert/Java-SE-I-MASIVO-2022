package org.bedu.java.jse.basico.sesion01.tarea;

public class Main {

    public static void main(String[] args) {

        Address direccion = new Address();
        direccion.setCalle("Córdoba");
        direccion.setExterior("56");
        direccion.setColonia("Roma Nte.");
        direccion.setAlcaldia("Cuauhtémoc");
        direccion.setCiudad("CDMX");
        direccion.setEstado("México");
        direccion.setCodigoPostal("06700");

        Persona beto = new Persona();
        beto.setPrimerNombre("Beto");
        beto.setPrimerApellido("Bedu");
        beto.setDireccion(direccion); // Esta es la asociación Has-A

        System.out.println(beto);
    }
}
