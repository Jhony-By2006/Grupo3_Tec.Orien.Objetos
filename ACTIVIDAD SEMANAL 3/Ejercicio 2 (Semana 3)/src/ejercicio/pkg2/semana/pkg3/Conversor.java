/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2.semana.pkg3;

/**
 *
 * @author Etu Fashin
 */
public class Conversor {
    
    //grados Celsius a Fahrenheit.
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    //fahrenheit a Celsius.
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    //kilómetros a millas.
    public static double kilometrosAMillas(double kilometros) {
        return kilometros * 0.621371;
    }
    //millas a kilómetros.
    public static double millasAKilometros(double millas) {
        return millas / 0.621371;
    }
    //segundos a minutos y segundos
    public static double segundosAMinutosYSegundos(int segundos) {
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;
        System.out.println(minutos + " minutos y " + segundosRestantes + " segundos");
        return 0;
    }
    //minutos y segundos a segundos
    public static int minutosYSegundosASegundos(int minutos, int segundos) {
        return (minutos * 60) + segundos;
    }
}
