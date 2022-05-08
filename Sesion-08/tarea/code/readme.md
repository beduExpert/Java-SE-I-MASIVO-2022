# Tarea 08: Manejo de archivos

## 🎯 Objetivo

* Practicar la lectura y escritura de archivos
* Generar y leer un archivo cvs

## 🧾 Requisitos

* Tener instalada la última versión del `JDK 8`.
* Tener instalada la última versión de `IntelliJ IDEA Community`.
* Haber realizado los ejemplos y retos del `work`.

## 💻 Desarrollo

* Genera un proyecto con el siguiente paquete y clases
  * `org.bedu.java.jse.basico.sesion08.tarea`
    * `Main` - Clase principal para ejecutar el programa
    * `CsvManager`
      * `fileName`: String - atributo con la ruta y nombre del archivo a generar/leer
      * `CsvManager(String fileName)` - constructor que solicita el nombre del archivo
      * `generaArchivoCsv()`:void - método para generar un archivo programmers.csv con las columnas: Lenguaje, Autor y Pais de nacimiento 
      * `leeArchivoCsv()`:void - método para leer un archivo csv
  * En el método `main` de la clase `Main` crea una instancia de `CsvManager` y ejecuta ambos métodos
  * Tu salida debe ser algo similar a la siguiente
    * Creación de un archivo llamado `programmers.csv`
    ```shell
    Lenguaje,Autor,Pais de nacimiento
    Java,James Gosling,Canada
    JavaScript,Brendan Eich,Estados Unidos
    Python,Guido van Rossum,Alemania
    Node,Ryan Dahl,Estados Unidos
    ```
    * Impresion en pantalla del contenido separado por una tabulación
    ```shell
    Lenguaje	Autor             Pais de nacimiento
    Java        James Gosling     Canada
    JavaScript	Brendan Eich      Estados Unidos
    Python      Guido van Rossum  Alemania
    Node        Ryan Dahl         Estados Unidos
    ```

## 📝 Solución
<details>
	<summary>mostrar</summary>

Cuando tengas tu propuesta, puedes compararla con la que se propone en este directorio observando los siguientes puntos

* En la carpeta `code` está el proyecto
* En la code `src` está el código
* La clase que ejecuta el programa es `Main.java`
</details>
