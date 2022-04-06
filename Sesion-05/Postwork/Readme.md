## Postwork 05: Creación de listas y lectura de opciones.

### OBJETIVO

- Modificar los atributos de los objetos actuales para evitar su modificación.
- Leer los valores de algunas de las opciones existentes.

#### REQUISITOS

1. El avance del postwork de la sesión 04.

#### DESARROLLO

En este postwork deberás marcar las fechas de creación de las clases **ListaTareas** y **Tarea** como final, para evitar su posterior modificación. Para esto deberás modificar o eliminar algunos de los métodos ya existentes.

Además, leerás desde el teclado algunos de los valores de las opciones que se usan en **ListasTareas**.

<details>
        <summary>Solución</summary>
        
1. En la clase **ListaTareas** marca el atributo **fechaCreacion** como ***final***. Esto hará que tengas que eliminar el *setter* de esta propiedad.

```java
private final LocalDate fechaCreacion;
```

2. Haz lo mismo en la clase **Tarea**; en este caso también tendrás que eliminar el *setter* correspondiente.

```java
private final LocalDate fechaCreacion;
```

3. Hasta ahora, en la clase **Lector** solamente existe un método llamado **leeOpcion**, el cual lee un valor de tipo **byte**. Agrega un segundo método que permita leer una cadena y la regrese:

```java
    public String leeCadena(){
        System.out.print("Cadena: ");
        return scanner.nextLine();
    }
```

4. En la clase **ListasTareas**, dentro de los métodos solamente estamos mostrando el nombre de la opción seleccionada. Leeremos algunos valores adicionales en estos métodos, y en la siguiente sesión comenzaremos a crear realmente los elementos de las listas de tareas que harán que la aplicación tenga una funcionalidad rica y útil. Agrega en esta clase una nueva instancia de **Lector**, que será la que nos permita leer las opciones ingresadas por el usuario:

```java
private Lector lector = new Lector();
```

6. En el método **crearNuevaLista**, usa el nuevo método **leeCadena** de `Lector` para leer el nombre de la nueva lista de tareas, y posteriormente crea un nuevo objeto de tipo **ListaTareas**, pasando el nombre anterior en su constructor:

```java
    public void crearNuevaLista() {
        System.out.println("Crear nueva lista de tareas.");

        String nombre = lector.leeCadena();

        ListaTareas lista = new ListaTareas(nombre);
    }
```

7. En el método **verTareasDeLista**, usa el método **leeOpcion** para leer un valor numérico, que usaremos en la próxima sesión:

```java
    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");

        byte lista = lector.leeOpcion();
    }
```

8. Haz lo mismo en los métodos **actualizarListaDeTareas** y **eliminarListaDeTareas**:

```java
    public void actualizarListaDeTareas() {
        System.out.println("Actualizar lista de tareas.");

        byte lista = lector.leeOpcion();
    }


    public void eliminarListaDeTareas() {
        System.out.println("Eliminar lista de tareas.");
        byte lista = lector.leeOpcion();
    }
```
9. Ejecuta tu aplicación, todo debe seguir funcionando correctamente.

</details>

