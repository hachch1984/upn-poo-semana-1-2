# Calculadora de consola - POO

Proyecto Java desarrollado para la actividad de campo de las semanas 1 y 2 del curso
Tecnicas de Programacion Orientada a Objetos.

## Funciones iniciales

- Suma.
- Resta.
- Multiplicacion.
- Division con validacion de division entre cero.
- Lectura y validacion de datos desde la consola.
- Historial de las operaciones realizadas durante la ejecucion.

## Conceptos de POO aplicados

- Clase `Calculadora` con atributos privados.
- Constructor para inicializar objetos.
- Metodos de acceso `getNombre()` y `setNombre()`.
- Encapsulamiento del ultimo resultado obtenido.
- Atributo y metodo `static` para contar las operaciones realizadas.
- Coleccion encapsulada de objetos `Operacion` para representar el historial.

## Requisitos

- JDK 17 o superior.
- Visual Studio Code con Extension Pack for Java.

## Ejecutar desde Visual Studio Code

1. Abra esta carpeta en Visual Studio Code.
2. Abra `src/Main.java`.
3. Presione **Run Java** sobre el metodo `main`.

## Ejecutar desde la terminal

```powershell
javac -d bin src/*.java
java -cp bin Main
```
