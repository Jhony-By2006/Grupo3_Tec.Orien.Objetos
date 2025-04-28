/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2.semana.pkg3;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio2Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         //Ejercicio: Crea una clase Conversor con un metodo convertir sobrecargado para
    //Convertir grados Celsius a Fahrenheit.
    //Convertir kilómetros a millas.
    //Convertir segundos a minutos y segundos

       int n;
       do {
           System.out.println("Ingrese la conversión que quiere hacer:");
           System.out.println("1. Celsius a Fahrenheit");
           System.out.println("2. Kilómetros a millas");
           System.out.println("3. Segundos a minutos y segundos");
           System.out.println("4. Minutos y segundos a segundos");
           System.out.println("5. Fahrenheit a Celsius");
           System.out.println("6. Millas a kilómetros");
           System.out.println("0. Salir");
           n = Integer.parseInt(System.console().readLine());

            switch (n) {
                case 1:
                    System.out.println("Ingrese los grados Celsius:");
                    double celsius = Double.parseDouble(System.console().readLine());
                    double fahrenheit = Conversor.celsiusAFahrenheit(celsius);
                    System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
                    break;
                case 2:
                    System.out.println("Ingrese los kilómetros:");
                    double kilometros = Double.parseDouble(System.console().readLine());
                    double millas = Conversor.kilometrosAMillas(kilometros);
                    System.out.println(kilometros + " kilómetros son " + millas + " millas.");
                    break;
                case 3:
                    System.out.println("Ingrese los segundos:");
                    int segundos = Integer.parseInt(System.console().readLine());
                    Conversor.segundosAMinutosYSegundos(segundos);
                    break;
                case 4:
                    System.out.println("Ingrese los minutos:");
                    int minutos = Integer.parseInt(System.console().readLine());
                    System.out.println("Ingrese los segundos:");
                    int segundos2 = Integer.parseInt(System.console().readLine());
                    int totalSegundos = Conversor.minutosYSegundosASegundos(minutos, segundos2);
                    System.out.println(minutos + " minutos y " + segundos2 + " segundos son " + totalSegundos + " segundos.");
                    break;
                case 5:
                    System.out.println("Ingrese los grados Fahrenheit:");
                    double fahrenheit2 = Double.parseDouble(System.console().readLine());
                    double celsius2 = Conversor.fahrenheitACelsius(fahrenheit2);
                    System.out.println(fahrenheit2 + " grados Fahrenheit son " + celsius2 + " grados Celsius.");
                    break;
                case 6:
                    System.out.println("Ingrese las millas:");
                    double millas2 = Double.parseDouble(System.console().readLine());
                    double kilometros2 = Conversor.millasAKilometros(millas2);
                    System.out.println(millas2 + " millas son " + kilometros2 + " kilómetros.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                        }
       } while (n != 0);
    }

}
