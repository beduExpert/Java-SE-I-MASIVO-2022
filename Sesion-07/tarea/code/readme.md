# Tarea 07: XXX

## 🎯 Objetivo

* Practicar el uso de colecciones de colecciones
* Implementar relaciones poliformicas

## 🧾 Requisitos

* Tener instalada la última versión del `JDK 8`.
* Tener instalada la última versión de `IntelliJ IDEA Community`.
* Haber realizado los ejemplos y retos del `work`.

## 💻 Desarrollo

* Genera la siguiente estructura de paquetes y clases
  * `org.bedu.java.jse.basico.sesion07.tarea`
    * `Main` - para ejecutar el programa
    * `Articulo` - Clase abstracta base para cualquier artículo
      * Articulo(String departamento, double precio)
      * Articulo(String departamento)
      * Articulo(double precio)
      * departamento: String
      * precio: double
    * `Inventario` - Clase para controlar la gestión de los artículos
      * inventario: Map<String, List<Articulo>>
      * agregaArticulo(String tipo, Articulo articulo): void
      * getArticulosDisponibles(): List<Articulo>
  * `org.bedu.java.jse.basico.sesion07.tarea.electronico`
    * `ArticuloElectronico` - clase abstracta base para artículos electrónicos que es subclase de `Articulo`
      * ArticuloElectronica(String departamento, double precio, String fabricante, String modelo)
      * fabricante: String
      * modelo: String
    * `Laptop` subclase de `ArticuloElectronico`
      * Laptop(double precio, String fabricante, String modelo)
    * `Pantalla` subclase de `ArticuloElectronico`
      * Pantalla(double precio, String fabricante, String modelo)
    * `Tablet` subclase de `ArticuloElectronico`
      * Tablet(double precio, String fabricante, String modelo)
* Encapsula los elementos de las clases y solo expón los getters
* En inventario define
  * `agregaArticulo(String tipo, Articulo articulo)` para que te permita agregar nuevos artículos generando el key cuando no existe o sumandolos al mismo en caso contrario
  * `getArticulosDisponibles()` para que te regrese una `List<Articulo>` con todos los elementos del inventario
* Dentro de la clase `Main` en su método `main` instancia cuando menos tres elementos de cada artículo electrónico teniendo como variable de referencia ArtículoElectronico donde el modelo debe ser el mismo para algunos de los artícilos argregados
, por ejemplo:
```java
ArticuloElectronica tb001_1 = new Tablet(12_000,"Huawei", "TB001");
ArticuloElectronica tb001_2 = new Tablet(12_000,"Huawei", "TB001");
ArticuloElectronica tb003 = new Tablet(18_000,"Huawei", "TB003");

inventario.agregaArticulo(tb001_1.getModelo(),tb001_1);
inventario.agregaArticulo(tb001_2.getModelo(),tb001_2);
inventario.agregaArticulo(tb003.getModelo(),tb003);
```

* Debes obtener una salida similar a la siguiente:
```shell
getArticulosDisponibles: [ArticuloElectronica{departamento='ELECTRONICA'precio='12000.0'fabricante='Acer', modelo='AC003'}, ArticuloElectronica{departamento='ELECTRONICA'precio='10000.0'fabricante='Samsung', modelo='PN001'}, ArticuloElectronica{departamento='ELECTRONICA'precio='10000.0'fabricante='Samsung', modelo='PN001'}, ArticuloElectronica{departamento='ELECTRONICA'precio='18000.0'fabricante='Huawei', modelo='TB003'}, ArticuloElectronica{departamento='ELECTRONICA'precio='15000.0'fabricante='Acer', modelo='AC001'}, ArticuloElectronica{departamento='ELECTRONICA'precio='15000.0'fabricante='Acer', modelo='AC001'}, ArticuloElectronica{departamento='ELECTRONICA'precio='12000.0'fabricante='Huawei', modelo='TB001'}, ArticuloElectronica{departamento='ELECTRONICA'precio='12000.0'fabricante='Huawei', modelo='TB001'}, ArticuloElectronica{departamento='ELECTRONICA'precio='15000.0'fabricante='Samsung', modelo='PN003'}]
```

## 📝 Solución
<details>
	<summary>mostrar</summary>

Cuando tengas tu propuesta, puedes compararla con la que se propone en este directorio observando los siguientes puntos

* En la carpeta `code` está el proyecto
* En la code `src` está el código
* La clase que ejecuta el programa es `Main.java`
</details>
