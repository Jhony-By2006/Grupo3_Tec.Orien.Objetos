/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6.semana.pkg1;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio6Semana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan", 120);
        Cliente c2 = new Cliente("Ana", 1300);
        Cliente c3 = new Cliente("Luis", 600);

        System.out.println(c1.getNombre() + " es cliente tipo: " + c1.determinarTipo());
        System.out.println(c2.getNombre() + " es cliente tipo: " + c2.determinarTipo());
        System.out.println(c3.getNombre() + " es cliente tipo: " + c3.determinarTipo());
    }
    
}
