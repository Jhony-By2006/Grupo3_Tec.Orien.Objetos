/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio5Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConversionTemperatura conversion = new ConversionTemperatura(70.0);
        System.out.println("--------------------------------");
        System.out.println("Temperatura en Celsius: " + conversion.getTemperaturaC());
        System.out.println("--------------------------------");
        System.out.println("Temperatura en Fahrenheit: " + conversion.convertirF());
    }
    
}
