# Calculadora de consola - POO

## Descripcion del proyecto

Esta aplicacion es una calculadora interactiva desarrollada en Java que se ejecuta
desde la consola. Permite realizar operaciones de suma, resta, multiplicacion y
division, valida los datos ingresados, controla la division entre cero y conserva
un historial de las operaciones realizadas durante la ejecucion.

El proyecto fue desarrollado por el **Grupo 11** del curso **Tecnicas de Programacion
Orientada a Objetos**, perteneciente a la carrera de **Ingenieria de Sistemas
Computacionales** de la **Universidad Privada del Norte (UPN)**.

## Integrantes

| **Nombres y apellidos**                  |
| :--------------------------------------- |
| **INGRID KATHERIN BUSTAMANTE HINOJO**    |
| **HENRY ALBERTO CHAVEZ CHAVEZ**          |
| **CARLOS EDSON MONTERO AYALA**           |
| **ANDREA NOEMI ZABALA DIAZ**             |

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
javac -d bin src/Calculadora.java src/Operacion.java src/Main.java
java -cp bin Main
```
