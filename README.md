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

## Como usar la aplicacion

Al iniciar el programa se muestra el siguiente menu:

| **Opcion** | **Accion**                                       |
| :--------: | ------------------------------------------------ |
| `1`        | Sumar dos numeros.                               |
| `2`        | Restar el segundo numero al primero.             |
| `3`        | Multiplicar dos numeros.                         |
| `4`        | Dividir el primer numero entre el segundo.       |
| `5`        | Mostrar el historial de operaciones de la sesion.|
| `0`        | Mostrar el total de operaciones y salir.         |

1. Escriba el numero de la opcion deseada y presione **Enter**.
2. Para las opciones del `1` al `4`, ingrese el primer y el segundo numero cuando
   el programa los solicite. Se aceptan numeros enteros y decimales con punto o coma.
3. La calculadora mostrara el resultado y regresara automaticamente al menu principal.
4. Use la opcion `5` para revisar las operaciones correctas realizadas durante la
   ejecucion actual. Una division entre cero muestra un mensaje de error y no se
   agrega al historial.
5. Seleccione `0` para finalizar el programa.

### Ejemplo de uso

```text
Seleccione una opcion: 1
Ingrese el primer numero: 12.5
Ingrese el segundo numero: 7.5
Resultado: 20.0

Seleccione una opcion: 5
--- HISTORIAL DE OPERACIONES ---
1. Suma: 12.5 + 7.5 = 20.0

Seleccione una opcion: 0
Operaciones realizadas: 1
Gracias por utilizar la calculadora.
```
