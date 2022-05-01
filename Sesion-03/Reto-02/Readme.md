## Reto 02: Clase Vehiculo y composición de clases

### OBJETIVO 

* Practicar la creación de clases compuestas por otras clases.
* Comenzar a pensar en la mejor forma de diseñar nuestras clases para cumplir un objetivo específico.

#### REQUISITOS 

* Tener instalada y configurada la última versión del `JDK 8`
* Tener instalada la última versión de `IntelliJ IDEA Community`

#### DESARROLLO
* Crea un proyecto `JavaSE` siguiendo lo que ya sabes hasta ahora
* Crea las siguientes clases
	* Champinion
		* alto: float
		* ancho: float
		* fresco: boolean
	* Queso
		* tipo: String
		* peso: float
		* fresco: boolean
	* Pizza
		* champs: Champinion[3]
		* queso: Queso
		* rebanadas: int
		* esQuesoFresco(Queso queso): boolean
		* sonChampinionesFrescos(Champinion cham1, Champinion cham2, Champinion cham3): boolean
		* cocinarPizza(Queso queso, Champinion champ1, Champinion champ2, Champinion champ3): void
		* cortarPizza(int rebanadas): int
		* comerPizza(): void
* Todos los atributos deben tener setter & getter
* Inicializa los champiñones definiendo sus atributos a través de los `setter` correspondientes
* Inicializa el queso definiendo sus atributos a través de los `setter` correspondientes
* Inicializa la pizza y verifica que los ingredientes sean frescos 
* solo si son frescos, procede a cocinarla, cortarla y comerla

## 📝 Solución
<details>
	<summary>mostrar</summary>

Cuando tengas tu propuesta, puedes compararla con la que se propone en este directorio observando los siguientes puntos

* En la carpeta `code` está el proyecto
* En la code `src` está el código
* La clase que ejecuta el programa es `Main.java`
</details>