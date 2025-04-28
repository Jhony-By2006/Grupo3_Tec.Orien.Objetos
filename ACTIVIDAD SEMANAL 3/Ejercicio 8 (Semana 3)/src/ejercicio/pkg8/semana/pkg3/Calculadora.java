/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg8.semana.pkg3;

/**
 *
 * @author Etu Fashin
 */
public class Calculadora {
    private double numerador;
    private double denominador;
    private double resultado;
    private Calculadora(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public static Calculadora getInstance(double numerador, double denominador) {
        return new Calculadora(numerador, denominador);
    }

    public double dividir() {
        if (denominador == 0) {
            System.out.println("Error: División por cero no permitida.");
            return 0;
        }
        resultado = (numerador / denominador);
        System.out.println("El resultado de la división es: " + resultado);
        return resultado;
    }
//    void Mostrar() {
//        System.out.println("El numerador es: " + numerador);
//        System.out.println("El denominador es: " + denominador);
//        System.out.println("El resultado es: " + resultado);
//    }
}
