/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg8.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Trabajador {
     private String nombre;
    private double precioHora;
    private int horasTrabajadas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
     public Trabajador(String nombre, double precioHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioBruto() {
        return precioHora * horasTrabajadas;
    }

    public double calcularImpuesto() {
        return calcularSalarioBruto() * 0.10;
    }

    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularImpuesto();
    }
    
}
