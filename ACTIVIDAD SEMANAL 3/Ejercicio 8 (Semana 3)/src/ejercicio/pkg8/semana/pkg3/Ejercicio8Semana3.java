/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8.semana.pkg3;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio8Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio:  Crea  un  programa  que  pida  al  usuario  ingresar  dos  números  enteros  y  realice  su
        //división.  Maneja  las  excepciones  ArithmeticException  (división  por  cero)  y
        //InputMismatchException (si el usuario ingresa un valor no numérico).

        double numerador;
        double denominador;
        boolean validacion = false;
        while (validacion != true) {
            System.out.print("Ingrese el numerador: ");
            String num = System.console().readLine();
            numerador = Double.parseDouble(num);
            System.out.print("Ingrese el denominador: ");
            String den = System.console().readLine();
            denominador = Double.parseDouble(den);
            Calculadora c =  Calculadora.getInstance(numerador, denominador);
            c.dividir();
            System.out.printf("Desea realizar otra division? (S/N): ");
            String respuesta = System.console().readLine();
            if (respuesta == "N" || respuesta == "n") {
                validacion = true;
            } else if (respuesta == "S" || respuesta == "s") {
                System.out.println(" Continuando...");
            }
        }

    }
    
}
