/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio1 {

    public static void calcularFibonacci() {
        System.out.println("");
        System.out.println("Ejercicio 1");
        System.out.println("Escribe una función recursiva en Java para calcular el n-ésimo término de la secuencia de Fibonacci.");
        System.out.println("La sucesión de Fibonacci es una secuencia de números en la que cada número es la suma de los dos anteriores, comenzando con 0 y 1. La secuencia comienza así:\n"
                + "\n"
                + "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ....]\n"
                + "\n"
                + "En términos matemáticos, la sucesión de Fibonacci (F(n)) para un índice (n) se define de la siguiente manera:\n"
                + "\n"
                + "[F(n) = F(n-1) + F(n-2)]\n"
                + "\n"
                + "con las condiciones iniciales:\n"
                + "\n"
                + "[F(0) = 0, y F(1) = 1]\n"
                + "\n"
                + "Esto significa que cada número en la secuencia es la suma de los dos números anteriores.\nLa secuencia de Fibonacci tiene muchas aplicaciones en matemáticas y ciencias de la computación.\n");

        //  Implementa la lógica del ejercicio 3 aquí
        int numeroTermino = 10;
        int resultado = calcularFibonacci(numeroTermino);
        System.out.println("El término " + numeroTermino + " de la secuencia de Fibonacci es: " + resultado);

    }

    /**
     * Calcula el término n de la secuencia de Fibonacci.
     *
     * @param n El término de la secuencia que se desea calcular.
     * @return El valor del término n de la secuencia de Fibonacci.
     */
    public static int calcularFibonacci(int n) {
        // Casos base: si n es 0 o 1, se devuelve n
        if (n <= 1) {
            return n;
        } else {
            // Se calcula el término n sumando los términos (n - 1) y (n - 2)
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

}
