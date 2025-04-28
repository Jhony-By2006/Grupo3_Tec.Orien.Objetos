/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Ejercicio8Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Trabajador trabajador = new Trabajador("Juan Pérez", 15.0, 40);

        // Calcular y mostrar resultados
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Salario Bruto: " + trabajador.calcularSalarioBruto());
        System.out.println("Impuesto: " + trabajador.calcularImpuesto());
        System.out.println("Salario Neto: " + trabajador.calcularSalarioNeto());

    }
    
}
