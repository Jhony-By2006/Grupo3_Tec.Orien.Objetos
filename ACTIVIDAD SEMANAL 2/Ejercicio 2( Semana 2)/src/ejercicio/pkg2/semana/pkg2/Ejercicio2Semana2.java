/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio2Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Numero numero = new Numero(3);
        System.out.println("--------------------------------------------------");
        System.out.println("Numero: " + numero.getNumeroReal());
        System.out.println("--------------------------------------------------");
        System.out.println("Raiz Cuadrada: " + numero.raizCuadrada());
        System.out.println("--------------------------------------------------");
        System.out.println("Cubo: " + numero.calcularcubo());
        System.out.println("--------------------------------------------------");
    }
    
}
