/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5.semana.pkg1;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio5Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Producto libro = new Producto("Libreria", 50, 90);
        System.out.println("Producto: " + libro.getNombre());
        System.out.println("Ganancia: $" + libro.calcularGanancia());
    }
    
}
