package org.bedu.java.jse.basico.sesion2.ejemplo2;

public class Switch {
    public static void main(String[] args) {

        //Primer switch, calificaciones
        /*String mensaje;
        byte calificacion = 5;

        switch(calificacion) {
            case 10:
                mensaje = "¡Excelente!";
                break;
            case 9:
            case 8:
                mensaje = "¡Muy bien!";
                break;
            case 7:
                mensaje = "Bien hecho";
                break;
            case 6:
                mensaje = "Pasaste";
                break;
            default :
                mensaje = "Mejor vuelve a intentarlo";
        }

        System.out.println("Tu calificación es " + calificacion + ". " + mensaje);
*/

        //Segundo switch, meses para terminar el año
        String mesActual = "agosto";

        switch (mesActual){
            case "enero":
                System.out.print("febrero,");
            case "febrero":
                System.out.print(" marzo,");
            case "marzo":
                System.out.print(" abril,");
            case "abril":
                System.out.print(" mayo,");
            case "mayo":
                System.out.print(" junio,");
            case "junio":
                System.out.print(" julio,");
            case "julio":
                System.out.print(" agosto,");
            case "agosto":
                System.out.print(" septiembre,");
            case "septiembre":
                System.out.print(" octubre,");
            case "octubre":
                System.out.print(" noviembre,");
            case "noviembre":
                System.out.print(" diciembre.");
        }


    }
}
