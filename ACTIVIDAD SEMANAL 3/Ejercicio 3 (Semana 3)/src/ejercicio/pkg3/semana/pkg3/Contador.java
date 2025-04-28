/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3.semana.pkg3;

/**
 *
 * @author Etu Fashin
 */
public class Contador {
     private static int totalObjetos = 0;

    public Contador() {
        totalObjetos++;
    }

    public static void mostrarTotal(){
        System.out.println("Total de objetos son: " + totalObjetos);
    }
}
