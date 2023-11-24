/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio4 {

    /**
     * Método principal para probar la funcionalidad de los vehículos. Incluye
     * la definición de una clase abstracta Vehiculo y sus subclases Coche y
     * Bicicleta.
     */
    public static void probarVehiculos() {
        // Definición de la clase abstracta Vehiculo
        abstract class Vehiculo {

            abstract void acelerar();

            abstract void frenar();
        }

        // Subclase Coche que extiende la clase abstracta Vehiculo
        class Coche extends Vehiculo {

            @Override
            void acelerar() {
                System.out.println("El coche está acelerando");
            }

            @Override
            void frenar() {
                System.out.println("El coche está frenando");
            }
        }

        // Subclase Bicicleta que extiende la clase abstracta Vehiculo
        class Bicicleta extends Vehiculo {

            @Override
            void acelerar() {
                System.out.println("La bicicleta acelera pedaleando.");
            }

            @Override
            void frenar() {
                System.out.println("La bicicleta está frenando");
            }
        }
    }
}
