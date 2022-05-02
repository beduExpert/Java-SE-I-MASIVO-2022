# Ejemplo 01: Bloques de inicialización

## Objetivo

* Practicar el uso de bloques de inicialización en Java.
* Comprender que se pueden tener múltiples bloques de inicialización para una misma clase y el orden en el que estos se ejecutan.

## Requisitos

* Tener instalada la última versión del JDK 8.
* Tener instalada la última versión de IntelliJ IDEA Community

## Desarrollo

* Genera un proyecto `JavaSE` aplicando lo que sabes hasta ahora

### Modificador de acceso `default`

* Genera el siguiente paquete y clases
    * org.bedu.java.jse.basico.sesion04.ejemplo01
        * Main
        * DemoDefault

* Dentro de `DemoDefault` eliminemos el modificador de acceso `public` al inicio de la clase
* Hagamos dos métodos `metodoDefault` sin modificador de acceso y metodoPublico con modificador de acceso público

```java
package org.bedu.java.jse.basico.sesion04.ejemplo01;

// observa que hemos eliminado el modificador de acceso a nivel clase
class DemoDefault {

    // observa que hemos eliminado el modificador de acceso a nivel método
    void metodoDefault(){
        System.out.println("[DemoDefault] método default");
    }

    public void metodoPublico(){
        System.out.println("[DemoDefault] método público");
    }
}
```

* Dentro de la clase `Main` en el método `main` genera una instancia y manda a llamar a ambos métodos

```java
    DemoDefault demoDefault = new DemoDefault();
    demoDefault.metodoPublico();
    demoDefault.metodoDefault();
```

* Como puedes notar, la llamada se realiza sin problema aún sin tener modificador de acceso

* Ahora probemos lo mismo pero con una clase que se encuentre en otro paquete
    * org.bedu.java.jse.basico.sesion04.ejemplo01.defaultma
        * DemoDefaultExterna

* Intenta crear una instancia y llamar a ambos métodos

```java
    // esta clase no puede ser accedida por tener un modificador "default" a nivel de clase y estar en otro package
    DemoDefaultExterna demoDefaultExterna = new DemoDefaultExterna();
    demoDefaultExterna.metodoPublico();
    demoDefaultExterna.metodoDefault();
```

* Prueba poniendo el modificar `public` a nivel clase y después a nivel método en `DemoDefaultExterna`

### Modificador de acceso `private`

* En el mismo paquete donde tenemos nuestra clase `Main`, crea una llamada `DemoPrivate` y sigue la misma lógica que hemos lllevado hasta ahora creando dos métodos, uno llamado `metodoPrivado` con modificador de acceso `private` y otro llamado `metodoPublico` con modificador de acceso `public`

```java
package org.bedu.java.jse.basico.sesion04.ejemplo01;

public class DemoPrivate {

    private void metodoPrivado(){
        System.out.println("[DemoPrivate] método privado");
    }

    public void metodoPublico(){
        System.out.println("[DemoPrivate] método público");
    }
}
```

* Crea una instancia de `DemoPrivate` en nuestro método `main` e intenta llamar ambos métodos

```java
    DemoPrivate demoPrivate = new DemoPrivate();
    demoPrivate.metodoPublico();
    demoPrivate.metodoPrivado(); // no puede ser accedido fuera de la clase
```

* Prueba llamando a `metodoPrivado` en `metodoPublico`. Esa es la manera de usar a los métodos privados; estando en la misma clase.

### Modificador de acceso `protected`

* La funcionalidad del modificador de acceso `protected` es facilmente entendida a través de un ejemplo. Para eso vamos a crear una clase `DemoProtected` en el mismo paquete que nuestra clase `Main` con un método llamado metodoProtected y modificador de acceso `protected` y otro llamado `metodoPublico` con modificador de acceso `public`

```java
package org.bedu.java.jse.basico.sesion04.ejemplo01;

public class DemoProtected {

    protected void metodoProtected(){
        System.out.println("[DemoProtected] método protected");
    }

    public void metodoPublico(){
        System.out.println("[DemoProtected] método público");
    }
}
```

* Procedamos a crear una instancia en el método `main` y llamar a ambos métodos

```java
    DemoProtected demoProtected = new DemoProtected();
    demoProtected.metodoPublico();
    demoProtected.metodoProtected(); // puede ser accedido dentro del mismo package
```

* Hasta ahora nada sorprendente, ¿cierto?, en realidad parece no tener diferencia con `default` o `public` pero eso es solo porque estamos en el mismo paquete. Probemos creando una clase con características similares en otro paquete.

* Hagamos el siguiente paquete y clase
    * `org.bedu.java.jse.basico.sesion04.ejemplo01.protectedma`
        * `DemoProtectedExterna`

* Dentro de `DemoProtectedExterna` creemos dos métodos, uno llamado `metodoProtected` con modificador de acceso `protected` y otro llamado `metodoPublico`con modificador de acceso `public`

```java
package org.bedu.java.jse.basico.sesion04.ejemplo01.protectedma;

public class DemoProtectedExterna {

    protected void metodoProtected(){
        System.out.println("[DemoProtectedExterna] método protected");
    }

    public void metodoPublico(){
        System.out.println("[DemoProtectedExterna] método público");
    }
}
```

* Probemos crear una instancia de `DemoProtectedExterna` en nuestro método `main` y llamar a ambos métodos

```java
    DemoProtectedExterna demoProtectedExterna = new DemoProtectedExterna();
    demoProtectedExterna.metodoPublico();
    demoProtectedExterna.metodoProtected(); // no puede ser accedido al no estar en el mismo package o tener relacion de herencia
```

* Ahora probemos con un caso similar pero estableciendo una relación de herencia con la siguiente estructura
    * `org.bedu.java.jse.basico.sesion04.ejemplo01.protectedma2`
        * `DemoProtectedExternaHija` siendo hija de `DemoProtectedExterna`

* En `DemoProtectedExternaHija` creemos los mismos métodos que en `DemoProtectedExterna` solo que esta vez en `protected` intentaremos acceder al método `protected` del padre y llamaremos a `metodoProtected` dentro de `metodoPublico`

```java
package org.bedu.java.jse.basico.sesion04.ejemplo01.protectedma2;

import org.bedu.java.jse.basico.sesion04.ejemplo01.protectedma.DemoProtectedExterna;

public class DemoProtectedExternaHija extends DemoProtectedExterna {

    protected void metodoProtected(){
        System.out.print("[DemoProtectedExternaHija] accediendo a método protegido fuera del package ...");
        super.metodoProtected(); // aquí podemos acceder por tener una relación de herencia
    }

    public void metodoPublico(){
        System.out.print("[DemoProtectedExternaHija] método público");
        this.metodoProtected();
    }
}
```

* Esta vez, aunque estamos en otro paquete, podemos acceder por tener una relación de herencia

* Ahora creemos una instancia de `DemoProtectedExternaHija` en nuestro método `main` e intentemos llamar a ambos métodos

```java
    DemoProtectedExternaHija demoProtectedExternaHija = new DemoProtectedExternaHija();
    demoProtectedExternaHija.metodoPublico();
    demoProtectedExternaHija.metodoProtected(); // no puede ser accedido al no estar en el mismo package o tener relacion de herencia
```

* Vemos que el comportamiento es similar al de `DemoProtectedExterna` y no podemos acceder al método `protected`
