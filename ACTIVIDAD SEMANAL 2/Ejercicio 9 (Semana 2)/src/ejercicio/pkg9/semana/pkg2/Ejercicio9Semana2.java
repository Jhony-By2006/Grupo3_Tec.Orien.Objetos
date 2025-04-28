/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio9Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GasIdeal gas = new GasIdeal(300, 2, 10);
        double presion = gas.calcularP();

        System.out.println("La presión del gas ideal es: " + presion + " atm");
    }
    
}
