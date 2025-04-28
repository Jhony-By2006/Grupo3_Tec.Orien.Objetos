/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio7Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto producto = new Producto("Laptop", 500.0, 750.0);

        System.out.println("La ganancia del producto " + producto.getNombre() + " es: "+ producto.calcularGanancia());
    }
    
}
