/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio5 {

    /**
     * Método principal para probar la funcionalidad de las clases relacionadas
     * con la red. Incluye la creación de la interfaz ConexionRed y las clases
     * Router y Computadora que la implementan.
     */
    public static void probarConexionRed() {
        System.out.println("");
        System.out.println("Ejercicio 5");
        System.out.println("");
        System.out.println("Crea una interfaz llamada ConexionRed con métodos conectar() y desconectar().\nLuego, implementa esta interfaz en las clases Router y Computadora.\nLa clase Router debe tener un método adicional configurarRed().\n");
        // Implementa la lógica del ejercicio 5 aquí
    }

    /**
     * Interfaz que define el comportamiento para la conexión y desconexión de la
     * red.
     */
    public interface ConexionRed {

        void conectar();

        void desconectar();
    }

    /**
     * Clase Router que implementa la interfaz ConexionRed. Proporciona métodos
     * para conectar, desconectar y configurar la red.
     */
    static class Router implements ConexionRed {

        @Override
        public void conectar() {
            System.out.println("El router se ha conectado a la red.");
        }

        @Override
        public void desconectar() {
            System.out.println("El router se ha desconectado de la red.");
        }

        /**
         * Método adicional para configurar la red del router.
         */
        public void configurarRed() {
            System.out.println("Configurando la red del router...");
        }
    }

    /**
     * Clase Computadora que implementa la interfaz ConexionRed. Proporciona
     * métodos para conectar y desconectar de la red.
     */
    static class Computadora implements ConexionRed {

        @Override
        public void conectar() {
            System.out.println("La computadora se ha conectado a la red.");
        }

        @Override
        public void desconectar() {
            System.out.println("La computadora se ha desconectado de la red.");
        }
    }
}
