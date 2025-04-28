/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio4Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         TrianguloRectangulo triangulito = new TrianguloRectangulo(3, 4);

        System.out.println("El cateto 1 es: " + triangulito.getCateto1());
        System.out.println("El cateto 2 es: " + triangulito.CarcularHipotenusa());
        System.out.println("El area es: " + triangulito.CalcularPerimetro());

    }
    
}
