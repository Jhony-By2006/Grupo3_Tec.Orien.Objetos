/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.semana.pkg3;

/**
 *
 * @author Etu Fashin
 */
public class Banco {
    private static double tasaInteres;

    public static double getTasaInteres() {
        return tasaInteres;
    }

    public static void setTasaInteres(double tasaInteres) {
        Banco.tasaInteres = tasaInteres;
    }
    
     public static void actualizarTasaInteres(double nuevaTasa) {
        tasaInteres = nuevaTasa;
    }

    // Metodo estático para mostrar la tasa de interés
    public static double mostrarTasaInteres() {
        return tasaInteres;
    }
}
