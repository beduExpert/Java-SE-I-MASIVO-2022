package org.bedu.java.jse.basico.sesion2.reto2;

public class If {
    public static void main(String[] args) {
        String mensaje;
        byte calificacion = 5;

        if(calificacion == 10){
            mensaje = "¡Excelente!";
        } else if (calificacion == 9 || calificacion == 8){
            mensaje = "¡Muy bien!";
        } else if(calificacion == 7){
            mensaje = "Bien hecho";
        } else if (calificacion == 6){
            mensaje = "Pasaste";
        } else {
            mensaje = "Mejor vuelve a intentarlo";
        }

        //System.out.println("Tu calificación es " + calificacion + ". " + mensaje);

        String mesActual = "enero";

        if(mesActual == "enero"){
            System.out.print("febrero,");
            mesActual = "febrero";
        }
        if(mesActual == "febrero"){
            System.out.print(" marzo,");
            mesActual = "marzo";
        }
        if(mesActual == "marzo"){
            System.out.print(" abril,");
            mesActual = "abril";
        }
        if(mesActual == "abril"){
            System.out.print(" mayo,");
            mesActual = "mayo";
        }
        if(mesActual == "mayo"){
            System.out.print(" junio,");
            mesActual = "junio";
        }
        if(mesActual == "junio"){
            System.out.print(" julio,");
            mesActual = "julio";
        }
        if(mesActual == "julio"){
            System.out.print(" agosto,");
            mesActual = "agosto";
        }
        if(mesActual == "agosto"){
            System.out.print(" septiembre,");
            mesActual = "septiembre";
        }
        if(mesActual == "septiembre"){
            System.out.print(" octubre,");
            mesActual = "octubre";
        }
        if(mesActual == "octubre"){
            System.out.print(" noviembre,");
            mesActual = "noviembre";
        }
        if(mesActual == "noviembre"){
            System.out.print(" diciembre.");
        }
    }
}
