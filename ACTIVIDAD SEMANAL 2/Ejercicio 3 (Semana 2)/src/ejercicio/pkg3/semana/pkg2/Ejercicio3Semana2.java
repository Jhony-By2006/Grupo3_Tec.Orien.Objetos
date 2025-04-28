/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio3Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cilindro c1 = new Cilindro(2, 10);

        double volumen = c1.CalcularVolumen();
        System.out.println("El volumen del cilindro es: " + volumen);
    }
    
}
