/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6.semana.pkg3;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio6Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio: Crea una clase Libro que tenga una clase interna Pagina. La clase Pagina debe tener un
        // metodo mostrarContenido() que imprima un mensaje con el contenido de la página..
         // Creamos un libro con título, autor y contenido de su única página
      Libro miLibro = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "En un lugar de La Mancha, de cuyo nombre no quiero acordarme...");
      miLibro.agregarpagina("Don Quijote de la Mancha es una novela escrita por Miguel de Cervantes.");
      System.out.println("Contenido de la página 0");
      System.out.println("Contenido de la página 1");
      int n = Integer.parseInt(System.console().readLine());
      miLibro.mostrarContenido(n);
    }
    
}
