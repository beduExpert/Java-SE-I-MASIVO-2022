package org.bedu.java.jse.basico.sesion7.reto1;

import java.util.*;

public class Agenda {
    public static void main(String[] args) {
        Map<String, Queue<Telefono>> agenda = new TreeMap<>();

        agenda.put("Carlos", new PriorityQueue<Telefono>());
        agenda.put("Beto", new PriorityQueue<Telefono>());
        agenda.put("Abigail", new PriorityQueue<Telefono>());
        agenda.put("César", new PriorityQueue<Telefono>());
        agenda.put("Mónica", new PriorityQueue<Telefono>());
        agenda.put("Fernando", new PriorityQueue<Telefono>());

        Collections.addAll(agenda.get("Carlos"), new Telefono("5824-6397", 1), new Telefono("8271-9346", 2));
        Collections.addAll(agenda.get("Beto"), new Telefono("6185-7961", 1));
        Collections.addAll(agenda.get("Abigail"), new Telefono("6848-6573", 1), new Telefono("4152-6378", 2));
        Collections.addAll(agenda.get("César"), new Telefono("7418-5296", 1));
        Collections.addAll(agenda.get("Mónica"), new Telefono("7698-1254", 1), new Telefono("1973-4682", 2));
        Collections.addAll(agenda.get("Fernando"), new Telefono("9753-8642", 1));


        for (String nombre : agenda.keySet()) {
            Queue<Telefono> telefonos = agenda.get(nombre);

            System.out.print(nombre + ": ");

            Telefono tel = null;

            while ((tel = telefonos.poll()) != null){
                System.out.print("\t" + tel.getNumero() + "\n");
            }
        }
    }


}
