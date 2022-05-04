## Reto 01: Miembros estáticos

### Objetivo 

- Aprender el correcta declaración, uso y asignación de miembros estáticos.

### Requisitos 

1. Tener instalada la última versión del JDK 8.
2. Tener instalada la última versión de IntelliJ IDEA Community


### Desarrollo

* Genera una clase Alumno con los siguientes atributos:
    * nombre: String
    * edad: int
    * grupo: String
    * [static] counter: int
* Inicializa `counter` a 9 sin hacerlo sobre la misma declaración de la variable
> 🤓 Busca en google maneras de inicializar variables estáticas
* Agrega un constructor para todos los atributos disponibles (¿hay alguno que no te deje agregar? 🤔)
* Agregar `setters / getters` para todos los atributos haciendo uso del principio de encapsulamiento
* Agrega el método `toString` para tener una lectura clara de los valores de cada atributo

* En otro archivo, genera una clase `Main` con un método `main` e instancia tres alumnos
* Después de generar las instancias, imprime a cada uno de ellos junto con una llamada a `getCounter`

* Por último, imprime el valor de `counter` sin usar una instancia.

* ¿puedes explicar los valores generados?

### 📝 Solución
<details>
	<summary>mostrar</summary>

Cuando tengas tu propuesta, puedes compararla con la que se propone en este directorio observando los siguientes puntos

* En la carpeta `code` está el proyecto
* En la code `src` está el código
* La clase que ejecuta el programa es `Main.java`
</details>
