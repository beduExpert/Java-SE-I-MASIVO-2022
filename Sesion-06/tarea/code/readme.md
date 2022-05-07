# Tarea 06: Polimorfismo

## 🎯 Objetivo

* Diseñar relaciones Poliformicas
* Implementar el polimorfismo en un caso práctico

## 🧾 Requisitos

* Tener instalada la última versión del `JDK 8`.
* Tener instalada la última versión de `IntelliJ IDEA Community`.
* Haber realizado los ejemplos y retos del `work`.

## 💻 Desarrollo

* Genera la siguiente estructura de paquetes y clases
  * `org.bedu.java.jse.basico.sesion06.tarea`
	* `Main` - clase principal para ejecutar el proyecto
	* `Cuenta` - Clase abstracta para modelar una cuenta
		* INSTITUCION: String, constante
		* TIPO: String, constante
		* MIN: int, constante
		* MAX: int, constante
		* Inicializa las constantes en un bloque de inicialización
	* `CuentaRoja` - subclase de `Cuenta` que enmascara las constantes TIPO, MIN y MAX inicializando sus valores en un bloque de inicialización
	* `CuentaOro` - subclase de `Cuenta` que enmascara las constantes TIPO, MIN y MAX inicializando sus valores en un bloque de inicialización
	* `CuentaPlatinum` - subclase de `Cuenta` que enmascara las constantes TIPO, MIN y MAX inicializando sus valores en un bloque de inicialización
	* `Usuario` - clase que modela un cuentahabiente
		* Usuario(String nombre, String apellido, int edad)
		* Usuario(String nombre, String apellido, int edad, Cuenta cuenta)
		* nombre: String
		* apellido: String
		* edad: int
		* cuenta: Cuenta
* Para todas las clases que no sean la principal, sigue el principio de encapsulamiento y sobre escribe el método `toString` para tener una representación clara
* Dentro del método `main`, Intenta generar una instancia de la clase abstracta `Cuenta`, ¿entiendes por qué pasa esto?
* Genera algunos usuarios pasando cuentas de distintos tipos e imprimelos

## 📝 Solución
<details>
	<summary>mostrar</summary>

Cuando tengas tu propuesta, puedes compararla con la que se propone en este directorio observando los siguientes puntos

* En la carpeta `code` está el proyecto
* En la code `src` está el código
* La clase que ejecuta el programa es `Main.java`
</details>
