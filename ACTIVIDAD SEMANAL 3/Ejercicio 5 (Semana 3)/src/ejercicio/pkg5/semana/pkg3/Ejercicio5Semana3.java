/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5.semana.pkg3;

import java.util.Scanner;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio5Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Tipos de motor ---> V1,V2,V3....V8");
        Auto auto = new Auto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor que quiere buscar: ");
        String tipoMotor = scanner.nextLine();

        Auto.Motor motor = auto.new Motor(tipoMotor);
        motor.mostrarContenido();
    }
    
}
