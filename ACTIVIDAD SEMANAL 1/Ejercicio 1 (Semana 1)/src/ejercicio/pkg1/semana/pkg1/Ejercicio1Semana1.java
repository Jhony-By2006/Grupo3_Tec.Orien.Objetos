/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1.semana.pkg1;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio1Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Hospital hospital = new Hospital();

        try {
            Persona persona1 = new Persona("Juan Pérez", "DNI", "12345678");
            Persona persona2 = new Persona("María López", "Carnet de Extranjería", "CE987654");
            hospital.registrarPersona(persona1);
            hospital.registrarPersona(persona2);
            hospital.listarPersonasAtendidas();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
