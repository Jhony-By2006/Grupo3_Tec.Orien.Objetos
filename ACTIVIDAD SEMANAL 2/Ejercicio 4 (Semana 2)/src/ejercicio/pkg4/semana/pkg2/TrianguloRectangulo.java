/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class TrianguloRectangulo {
     private double cateto1;
    private double cateto2;

    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    
     public double CalcularArea(){
        return (cateto1 * cateto2) / 2;
    }
     
    public double CarcularHipotenusa(){
        return Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
    }
    
    public double CalcularPerimetro(){
        return cateto1 + cateto2 + CarcularHipotenusa();
    }
}
