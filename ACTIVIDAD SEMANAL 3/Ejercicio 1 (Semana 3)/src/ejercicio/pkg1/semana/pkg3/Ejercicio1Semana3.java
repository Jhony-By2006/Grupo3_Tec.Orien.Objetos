/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1.semana.pkg3;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio1Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Calculadora calculadora = new Calculadora();

        int sumaEnt = calculadora.sumar(4,5);
        System.out.println("La suma de dos enteros es: "+ sumaEnt);

        int sumaEnt2 = calculadora.sumar(4,5,6);
        System.out.println("La suma de tres enteros es: "+ sumaEnt2);

        double sumadoble = calculadora.sumar(4.5,5.5);
        System.out.println("La suma de dos numeros tipo doble es: "+ sumadoble);
    }
    
}
