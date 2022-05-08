package org.bedu.java.jse.basico.sesion08.tarea;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        CsvManager csvManager = new CsvManager("./programmers.csv");
        try {
            csvManager.generaArchivoCsv();
            csvManager.leeArchivoCsv();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
