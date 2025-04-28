/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2.semana.pkg2;

/**
 *
 * @author Etu Fashin
 */
public class Numero {
    private double numeroReal;

    public Numero(double numeroReal){
        this.numeroReal = numeroReal;
    }

    public double getNumeroReal() {
        return numeroReal;
    }

    public void setNumeroReal(double numeroReal) {
        this.numeroReal = numeroReal;
    }
    
    public double raizCuadrada(){
        return numeroReal * numeroReal;
    }
    public double calcularcubo(){
        return numeroReal * numeroReal * numeroReal;
    }
}
