/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg10.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Movil {
    
    private double velocidadInicial;
    private double tiempo;
    private double aceleracion;

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
    
  public Movil(double velocidadInicial, double tiempo, double aceleracion) {
        this.velocidadInicial = velocidadInicial;
        this.tiempo = tiempo;
        this.aceleracion = aceleracion;
    }
    public double calcularEspacio() {
        return (velocidadInicial * tiempo) + (0.5 * aceleracion * tiempo * tiempo);
    }
  
}
