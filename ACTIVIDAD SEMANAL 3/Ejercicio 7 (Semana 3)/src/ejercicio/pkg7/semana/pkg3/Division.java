/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg7.semana.pkg3;

/**
 *
 * @author Etu Fashin
 */
public class Division {
    private int numerador;
    private int denominador;

    public Division(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void realizarDivision() {
        try {
            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}
