/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg6.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class ConversionLongitud {
    private double metros;

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }
    
    public ConversionLongitud(double metros) {
        this.metros = metros;
    }

    public double convertirPies(){
        return metros * 3.28084;
    }

    public double convertirPulgadas(){
        return metros * 39.3701;
    }
}
