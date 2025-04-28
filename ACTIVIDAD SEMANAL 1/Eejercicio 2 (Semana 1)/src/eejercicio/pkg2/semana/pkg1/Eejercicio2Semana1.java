/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eejercicio.pkg2.semana.pkg1;

import java.util.Scanner;

/**
 *
 * @author Etu Fashin
 */
public class Eejercicio2Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el régimen laboral (CAS, 276 o 728):");
        String regimen = scanner.nextLine();

        Persona persona = new Persona(nombre, regimen);

        String resultadoValidacion = persona.validarRegimen();
        System.out.println("El régimen laboral de " + persona.getNombre() + ": " + resultadoValidacion);

        scanner.close();
    }
    
}
