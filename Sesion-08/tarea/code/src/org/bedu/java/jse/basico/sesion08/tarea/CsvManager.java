package org.bedu.java.jse.basico.sesion08.tarea;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class CsvManager {

    private String fileName;

    public CsvManager(String fileName) {
        this.fileName = fileName;
    }

    public void generaArchivoCsv() throws IOException {

        FileWriter csvWriter = new FileWriter(fileName);

        csvWriter.append("Lenguaje");
        csvWriter.append(",");
        csvWriter.append("Autor");
        csvWriter.append(",");
        csvWriter.append("Pais de nacimiento");
        csvWriter.append("\n");

        List<List<String>> rows = Arrays.asList(
            Arrays.asList("Java", "James Gosling", "Canada"),
            Arrays.asList("JavaScript", "Brendan Eich", "Estados Unidos"),
            Arrays.asList("Python", "Guido van Rossum", "Alemania"),
            Arrays.asList("Node", "Ryan Dahl", "Estados Unidos")
        );

        for (List<String> rowData : rows) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();
    }

    public void leeArchivoCsv() throws IOException {
        File csvFile = new File(fileName);
        if (csvFile.isFile()) {
            BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
            String row = null;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                for (String d : data) {
                    System.out.print(d + "\t");
                }
                System.out.println();
            }
            csvReader.close();
        }
    }
}
