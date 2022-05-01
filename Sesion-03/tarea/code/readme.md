# Tarea 03: Clases y objetos

## 🎯 Objetivo

* Usar la composición para generar un objeto más complejo
* Practicar las relaciones `Has-A`

## 🧾 Requisitos

* Tener instalada la última versión del `JDK 8`.
* Tener instalada la última versión de `IntelliJ IDEA Community`.
* Haber realizado los ejemplos y retos del `work`.

## 💻 Desarrollo

* Crea las clases:
  * Vehiculo
    * llantas: Llanta[4]
    * combustible: Combustible
    * setCombustible(Combustible combustible): void
    * colocaLlantas(Llanta delanteraIzquierda, Llanta delanteraDerecha, Llanta traseraIzquierda, Llanta traseraDerecha): void
  * Llanta
    * ancho: float
    * diametro: float
    * presion: float
    * rueda(): void
  * Combustible
    * litrosActuales: int
    * litrosMaximos: int
    * usaCombustible(): void
* Todos los atributos deben tener setter & getter para poder leerse y escribirse,
* El `Combustible` se debe gastar un litro cada vez que se mueva el auto y debe mostrar la cantidad de litros que quedan.
* Las `llantas` deben poder rodar mostrando un mensaje que indique que están rodando.
* El `vehículo` debe tener la capacidad de que se le coloquen las cuatro llantas y el combustible, además de avanzar (rodando las llantas y usando el combustible), sino hay combustible el auto no debe poder avanzar.

## 📝 Solución
<details>
	<summary>mostrar</summary>

Cuando tengas tu propuesta, puedes compararla con la que se propone en este directorio observando los siguientes puntos

* En la carpeta `code` está el proyecto
* En la code `src` está el código
* La clase que ejecuta el programa es `Main.java`
</details>
