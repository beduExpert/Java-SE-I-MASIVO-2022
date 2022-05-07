package org.bedu.java.jse.basico.sesion07.tarea;

import org.bedu.java.jse.basico.sesion07.tarea.electronico.ArticuloElectronica;
import org.bedu.java.jse.basico.sesion07.tarea.electronico.Laptop;
import org.bedu.java.jse.basico.sesion07.tarea.electronico.Pantalla;
import org.bedu.java.jse.basico.sesion07.tarea.electronico.Tablet;

public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        ArticuloElectronica ac001_1 = new Laptop(15_000, "Acer", "AC001");
        ArticuloElectronica ac001_2 = new Laptop(15_000, "Acer", "AC001");
        ArticuloElectronica ac003 = new Laptop(12_000, "Acer", "AC003");

        inventario.agregaArticulo(ac001_1.getModelo(), ac001_1);
        inventario.agregaArticulo(ac001_2.getModelo(), ac001_2);
        inventario.agregaArticulo(ac003.getModelo(), ac003);

        ArticuloElectronica pn001_1 = new Pantalla(10_000, "Samsung", "PN001");
        ArticuloElectronica pn001_2 = new Pantalla(10_000, "Samsung", "PN001");
        ArticuloElectronica pn003 = new Pantalla(15_000, "Samsung", "PN003");

        inventario.agregaArticulo(pn001_1.getModelo(), pn001_1);
        inventario.agregaArticulo(pn001_2.getModelo(), pn001_2);
        inventario.agregaArticulo(pn003.getModelo(), pn003);

        ArticuloElectronica tb001_1 = new Tablet(12_000, "Huawei", "TB001");
        ArticuloElectronica tb001_2 = new Tablet(12_000, "Huawei", "TB001");
        ArticuloElectronica tb003 = new Tablet(18_000, "Huawei", "TB003");

        inventario.agregaArticulo(tb001_1.getModelo(), tb001_1);
        inventario.agregaArticulo(tb001_2.getModelo(), tb001_2);
        inventario.agregaArticulo(tb003.getModelo(), tb003);

        System.out.println("getArticulosDisponibles: " + inventario.getArticulosDisponibles());
    }
}
