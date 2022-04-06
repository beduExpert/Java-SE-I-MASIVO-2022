
## Ejemplo 02: Hola mundo desde la línea de comandos

### OBJETIVO

- Aprender a compilar un archivo `.java` desde la línea de comandos, sin necesidad de usar un IDE.
- Aprender a ejecutar una aplicación desde la línea de comandos.
#### REQUISITOS

1. Tener instalado el JDK 8 o superior.
2. Tener acceso a una terminal o línea de comandos.
3. Tener acceso a un editor de textos planos (como `notepad`o `nano`).
4. Tener agregadas en la variable PATH las rutas de las herramientas javac y java.

#### DESARROLLO
1. En Java usamos los paquetes para organizar y agrupar las clases. Como en este ejemplo no usaremos un IDE lo haremos a mano. Un paquete se representa como una carpeta o directorio en el sistema de archivos del sistema operativo que usamos, por lo tanto, para crear un paquete hay que crear una carpeta. 

En un directorio vacío de tu computadora crea una nueva carpeta llamada `src`, dentro esta una carpeta llamada `org`, y dentro de esta otra llamada `bedu`. A la misma altura que `src` crea una carpeta llamada `out`.

![imagen](img/img_02.png)

Para no complicar el ejemplo, usaremos sólo estas dos carpetas.

2. Dentro de la carpeta `bedu` crea un nuevo archivo llamado HolaMundo.java.

![imagen](img/img_01.png)


3. Dentro de este archivo coloca, como primera línea, lo siguiente:

		package org.bedu;

Esta sentencia le indica al compilador de Java que la clase que contendrá este archivo se encuentra en el paquete `org.bedu`.

4. Lo siguiente es declarar la clase HolaMundo como una clase pública. Por regla general, un archivo .java sólo puede tener una clase pública y el archivo debe tener el mismo nombre que esta clase. Como el archivo se llama `HolaMundo`, la clase que crearemos también tendrá este nombre:

```java
public class HolaMundo{

}
```

5. Dentro de esta clase, declararemos el método `main`. Recuerda que la firma de este método es estándar:

```java
public static void main(String[] args){
  
}
```
6. Ahora, dentro del método `main` colocaremos la instrucción que nos permite imprimir texto en pantalla; más adelante entraremos en detalles de cómo funciona, por ahora es suficiente con saber que la instrucción es:

		System.out.println("!!Hola Mundo¡¡");
		
7. El contenido completo del archivo `HolaMundo.java` debe ser el siguiente:

```java
package org.bedu;

public class HolaMundo{
  public static void main(String[] args){
    System.out.println("!!Hola Mundo¡¡");
  }
}
```

8. Ahora que ya tenemos nuestra clase, el siguiente paso es compilarla. Para esto, primero debes abrir una terminal o línea de comandos y navegar hasta el directorio raíz del proyecto; este es, el directorio que contiene a la carpeta `src`.

9. Una vez ahí, debes usar el compilador de java `javac`, indicando que el código fuente (el archivo **.java**) se encuentran en el directorio `src`, y con la opción `d` que los archivos compilados debe colocarlos en el directorio llamado `out`; de la siguiente forma:

		javac src/org/bedu/HolaMundo.java -d out		

Al ejecutar el comando anterior no habrá ninguna salida en consola, pero dentro de la carpeta `out` veremos que se crea la misma estructura de carpetas que en `src` y adentro de encuentra ahora un archivo **HolaMundo.class**. Este es el byte code de la aplicación Java.

![imagen](img/img_03.png)


10. El último paso es ejecutar la aplicación. Para ello debes entrar al directorio `out`.

		cd out
	
finalmente, invocar el intérprete de Java, a través de la herramienta `java`, la cual recibe como parámetro el nombre de la clase que ejecutará, de la siguiente forma:

		java org.bedu.HolaMundo
		
		
Si todo está bien escrito, debes ver la siguiente salida en la consola:

![imagen](img/img_04.png)

¡¡Felicidades!!, acabas de terminar el segundo ejemplo.
