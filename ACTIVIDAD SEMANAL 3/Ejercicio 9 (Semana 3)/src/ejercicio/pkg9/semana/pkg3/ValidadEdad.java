/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg9.semana.pkg3;

/**
 *
 * @author Etu Fashin
 */
public class ValidadEdad {
     public void verificarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("La edad debe ser mayor o igual a 18 años.");
        }
        else{
            System.out.println("La edad es valida: " + edad);
        }
    }
    
}
