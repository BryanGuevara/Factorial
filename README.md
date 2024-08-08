# Cálculo de Factorial

## Descripción

El programa **Cálculo de Factorial** es una aplicación de consola en Java que calcula el factorial de un número entero no negativo. Utiliza la clase `BigInteger` para manejar números grandes que exceden el límite de los tipos de datos primitivos en Java. El programa muestra el resultado del cálculo en una forma desglosada y manejable para números grandes.

## Funcionalidades

- Solicita al usuario un número entero no negativo.
- Calcula el factorial del número utilizando `BigInteger`.
- Muestra la multiplicación paso a paso.
- Formatea la salida para números grandes, dividiendo el resultado en líneas para una mejor legibilidad.
- Maneja errores para entradas no numéricas y números negativos.

## Uso

1. Al ejecutar el programa, se te pedirá que ingreses un número entero no negativo.
2. El programa calculará el factorial del número ingresado y mostrará el resultado, desglosando el cálculo paso a paso.
3. Para números grandes, la salida se formateará en múltiples líneas para facilitar la lectura.

## Ejemplo de Ejecución

```plaintext
=================================================== <[Entrada]> ==================================================
Introduzca un numero: 12
Para saber cuanto es 12! hacemos la siguiente multiplicación
=================================================== <[Calculo]> ==================================================
12 X 
11 X 
10 X 
9 X 
8 X 
7 X 
6 X 
5 X 
4 X 
3 X 
2 X 
1
_________
479001600
==================================================================================================================