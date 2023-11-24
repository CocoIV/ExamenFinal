/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author pablonoguera
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

    /**
     * Calcula el valor total del inventario a partir de un archivo y lo guarda
     * en otro archivo. Lee un archivo de texto llamado "datos.txt" que contiene
     * información sobre productos como el (nombre, precio y cantidad en stock).
     * Calcula el valor total del inventario (precio * cantidad) de cada
     * producto y guarda el resultado en un nuevo archivo llamado
     * "inventario.txt".
     */
    public static void calcularValorInventario() {
        System.out.println("");
        System.out.println("Ejercicio 3");
        System.out.println("");
        System.out.println("Escribe un programa en Java que lea un archivo de texto llamado \"datos.txt\" \nque contiene información sobre productos (nombre, precio y cantidad en stock). \nCalcula el valor total del inventario y guarda el resultado en un nuevo archivo llamado \"inventario.txt\".\n");

        File archivoEntradaFile = new File("datos.txt");
        File archivoSalidaFile = new File("inventario.txt");

        try ( FileReader fr = new FileReader(archivoEntradaFile);  BufferedReader br = new BufferedReader(fr);  FileWriter fw = new FileWriter(archivoSalidaFile);  BufferedWriter bw = new BufferedWriter(fw)) {

            String linea;
            double valorTotal = 0;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    String nombre = datos[0].trim();
                    double precio = Double.parseDouble(datos[1].trim());
                    int cantidad = Integer.parseInt(datos[2].trim());

                    double valorProducto = precio * cantidad;
                    valorTotal += valorProducto;

                    bw.write("Producto: " + nombre + ", Valor: " + valorProducto + "\n");
                }
            }

            bw.write("\nValor total del inventario: " + valorTotal);

            System.out.println("Se ha calculado el inventario correctamente y guardado en inventario.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
