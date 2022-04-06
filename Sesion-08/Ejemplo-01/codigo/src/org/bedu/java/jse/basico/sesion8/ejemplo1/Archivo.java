package org.bedu.java.jse.basico.sesion8.ejemplo1;

import java.io.File;

public class Archivo {
    public static void main(String[] args) {

        File archivo = new File("C:/temp/cursos/cursos.txt");

        System.out.println("Nombre del archivo:" + archivo.getName());
        System.out.println("Ruta: " + archivo.getPath());
        System.out.println("Ruta relativa: " + archivo.getAbsolutePath());
        System.out.println("Padre: " + archivo.getParent());
        System.out.println("Existe: " + archivo.exists());
        System.out.println("Está oculto: " + archivo.isHidden());

        if (archivo.exists()) {
            System.out.println("Se puede escribir en él: " + archivo.canWrite());
            System.out.println("Se puede leer: " + archivo.canRead());
            System.out.println("Se puede ejecutar: " + archivo.canExecute());
            System.out.println("Es un directorio: " + archivo.isDirectory());
            System.out.println("Tamaño del archivo en bytes: " + archivo.length());
        }
    }
}
