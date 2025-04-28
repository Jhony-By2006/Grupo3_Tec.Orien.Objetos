/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9.semana.pkg3;

import java.util.Scanner;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio9Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ValidadEdad validador = new ValidadEdad();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad que tienes: ");
        int edad = scanner.nextInt();

        try{
            validador.verificarEdad(edad);
        }catch (IllegalArgumentException e){
            System.out.println("Excepción capturada " + e.getMessage());
        }

        scanner.close();
    }
    
}
