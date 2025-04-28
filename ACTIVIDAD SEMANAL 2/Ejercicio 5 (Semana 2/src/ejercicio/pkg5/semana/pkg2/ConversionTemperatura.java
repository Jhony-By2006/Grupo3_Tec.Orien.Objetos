/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class ConversionTemperatura {
    private double temperaturaC;

    public double getTemperaturaC() {
        return temperaturaC;
    }

    public void setTemperaturaC(double temperaturaC) {
        this.temperaturaC = temperaturaC;
    }
    
    public ConversionTemperatura(double temperaturaCelsius) {
        this.temperaturaC = temperaturaCelsius;
    }
    public double convertirF() {
        return (temperaturaC * 9 / 5) + 32;
    }
}
