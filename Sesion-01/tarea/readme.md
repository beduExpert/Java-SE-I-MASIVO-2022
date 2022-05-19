# Tarea 01: Clases y asociaciones

## 🎯 Objetivo

* Crear un proyecto Java en `IntelliJ IDEA`.
* Crear un proyecto `JavaSE` practicando la relación `has-a` en un esquema `uno-a-uno`.
* Conocer el método `toString()` para representar un objeto en la consola.

## 🧾 Requisitos

* Tener instalada la última versión del `JDK 8`.
* Tener instalada la última versión de `IntelliJ IDEA Community`.
* Haber realizado los ejemplos y retos del `work`.

## 💻 Desarrollo

* Revisa la siguiente [liga](https://www.javatpoint.com/understanding-toString()-method) para entender cómo implementar el método `toString()` en una clase propia (las clases de Java ya lo tienen sobreescrito)
* Cuando realizamos la definición de objetos propios a partir de primitivos, hay ocasiones que un dato es declarado como cadena (`String`) pero cuando queremos usar la información, nos damos cuenta que separarla no es tan sencillo por lo que buscamos reescribirlo en una nueva clase y hacer la relación. Lo anterior pasa con la relación Persona y Address.
* Aplica los conceptos vistos en esta sesión para resolver lo siguiente:
    * Crea un proyecto Java.
    * Crea una clase principal llamada `Main.java`.
    * Crea una clase `Persona` con los siguientes campos:
        * primerNombre: String
        * segundoNombre: String
        * primerApellido: String
        * segundoApellido: String
        * edad: int
        * direccion: `Address`
    * Crea una clase `Address` con los siguientes campos:
        * calle: String
        * exterior: String
        * interior: String
        * colonia: String
        * alcaldia: String
        * codigoPostal: String
    * En la clase principal genera instancias de `Persona` `“seteando”` todos los valores correspondientes e imprime el resultado en la consola.


## 📝 Solución
<details>
	<summary>mostrar</summary>

Cuando tengas tu propuesta, puedes compararla con la que se propone en este directorio observando los siguientes puntos:

* En la carpeta `code` está el proyecto
* En la code `src` está el código
* La clase que ejecuta el programa es `Main.java`
</details>
