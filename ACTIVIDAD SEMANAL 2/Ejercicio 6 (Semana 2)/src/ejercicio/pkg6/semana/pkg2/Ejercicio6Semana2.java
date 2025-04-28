/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio6Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConversionLongitud conversion = new ConversionLongitud(10);

        double pies = conversion.convertirPies();
        double pulgadas = conversion.convertirPulgadas();

        System.out.println("Metros: " + conversion.getMetros());
        System.out.println("En pies: " + pies);
        System.out.println("En pulgadas: " + pulgadas);
    }
    
}
