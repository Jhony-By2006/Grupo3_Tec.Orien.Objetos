/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5.semana.pkg1;

/**
 *
 * @author Etu Fashin
 */
public class Producto {
     private String nombre;
     
 public Producto(String nombre, double precioCompra, double precioVenta) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }
  public double calcularGanancia() {
        return precioVenta - precioCompra;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    private double precioCompra;
    private double precioVenta;

    public String getNombre() {
        return nombre;
    }
}
