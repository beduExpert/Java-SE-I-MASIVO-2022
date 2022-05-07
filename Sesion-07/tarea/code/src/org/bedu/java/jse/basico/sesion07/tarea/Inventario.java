package org.bedu.java.jse.basico.sesion07.tarea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Inventario {

    private Map<String, List<Articulo>> inventario = new HashMap<>();

    public void agregaArticulo(String tipo, Articulo articulo) {
        if (!inventario.containsKey(tipo)) {
            List<Articulo> articulos = new ArrayList<>();
            articulos.add(articulo);
            inventario.put(tipo, articulos);
        } else {
            inventario.get(tipo).add(articulo);
        }
    }

    public List<Articulo> getArticulosDisponibles() {
        return inventario.values().stream().flatMap(List::stream).collect(Collectors.toList());
    }

}
