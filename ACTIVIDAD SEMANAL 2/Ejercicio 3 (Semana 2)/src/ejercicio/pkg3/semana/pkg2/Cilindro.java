/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Cilindro {
     private double radio;
    private double altura;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Cilindro(double radio, double altura){
        this.altura = altura;
        this.radio = radio;

    }
    public double CalcularVolumen(){
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
