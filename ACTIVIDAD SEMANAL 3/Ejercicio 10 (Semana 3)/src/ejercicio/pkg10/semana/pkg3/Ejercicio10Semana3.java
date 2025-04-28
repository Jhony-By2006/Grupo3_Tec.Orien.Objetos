/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg10.semana.pkg3;

import java.io.IOException;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio10Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         //Ejercicio: Crea una clase Archivo con un metodo leerArchivo(String nombreArchivo) que use
    //throws IOException. En el main, maneja la excepción con try-catch.

        Archivo archivo = new Archivo();
        String ruta = "D:\\Java\\TÉCNICAS DE PROGRAM.ORIE. OBJ\\prueva.txt";  // ruta archivo

        try {
            archivo.leerArchivo(ruta);
        } catch (IOException e) {
            // Manejo de la excepción: mostramos un mensaje de error
            System.err.println("Error leyendo el archivo '" + ruta + "': " + e.getMessage());
        }
    }
    
}
