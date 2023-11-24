package ejercicio2;

/**
 *
 * @author pablonoguera
 */
import java.util.ArrayList;

/**
 * Clase Cliente que representa un cliente con nombre, número de cliente y
 * saldo.
 */
class Cliente {

    private String nombre;
    private int numeroCliente;
    private double saldo;

    public Cliente(String nombre, int numeroCliente, double saldo) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
        this.saldo = saldo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

/**
 * Clase RegistroClientes gestiona la dinámicamente un conjunto de objetos
 * Cliente. Permite agregar y eliminar clientes y calcular el saldo total.
 */
public class Ejercicio2 {

    public static void gestionarClientes() {
        System.out.println("");
        System.out.println("Ejercicio 2");
        System.out.println("");
        System.out.println("Crea una clase llamada RegistroClientes que permita "
                + "gestionar dinámicamente un conjunto de objetos Cliente."
                + "\nCada Cliente debe tener un nombre, un número de cliente y un saldo.\nImplementa métodos para agregar un cliente, eliminar un cliente y calcular el saldo total de todos los clientes."
                + "\nDebe calcular la cantidad de bytes total del procedimiento calcular saldo total.\n");

        // Implementa la lógica del ejercicio 2 aquí
        class RegistroClientes {

            private final ArrayList<Cliente> clientes;

            public RegistroClientes() {
                clientes = new ArrayList<>();
            }

            /**
             * Agrega un nuevo cliente a la lista.
             *
             * @param nombre Nombre del cliente.
             * @param numeroCliente Número del cliente.
             * @param saldo Saldo del cliente.
             */
            public void agregarCliente(String nombre, int numeroCliente, double saldo) {
                Cliente nuevoCliente = new Cliente(nombre, numeroCliente, saldo);
                clientes.add(nuevoCliente);
            }

            /**
             * Elimina un cliente de la lista por número de cliente.
             *
             * @param numeroCliente Número del cliente a eliminar.
             */
            public void eliminarCliente(int numeroCliente) {
                for (Cliente cliente : clientes) {
                    if (cliente.getNumeroCliente() == numeroCliente) {
                        clientes.remove(cliente);
                        break;
                    }
                }
            }

            /**
             * Calcula el saldo total de todos los clientes.
             *
             * @return Saldo total de todos los clientes.
             */
            public double saldoTotal() {
                double saldoTotal = 0;
                for (Cliente cliente : clientes) {
                    saldoTotal += cliente.getSaldo();
                }
                return saldoTotal;
            }
        }
    }
}
