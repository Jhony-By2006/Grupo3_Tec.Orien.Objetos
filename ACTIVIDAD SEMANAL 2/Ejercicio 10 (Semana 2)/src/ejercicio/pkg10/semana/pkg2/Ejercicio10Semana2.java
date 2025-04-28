/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg10.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio10Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Movil movil = new Movil(10.0, 5.0, 2.0);

        double espacio = movil.calcularEspacio();
        System.out.println("El espacio recorrido por el móvil es: " + espacio + " metros.");
    }
    
}
