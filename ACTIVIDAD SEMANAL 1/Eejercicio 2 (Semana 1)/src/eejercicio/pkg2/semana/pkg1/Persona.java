/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eejercicio.pkg2.semana.pkg1;

/**
 *
 * @author Etu Fashin
 */
public class Persona {
     private String nombre;
    private String regimenLaboral;

    public Persona(String nombre, String regimenLaboral) {
        this.nombre = nombre;
        this.regimenLaboral = regimenLaboral;
    }

    public String validarRegimen() {
        if (regimenLaboral.equals("CAS") || regimenLaboral.equals("276") || regimenLaboral.equals("728")) {
            return "El régimen laboral es " + regimenLaboral + ".";
        } else {
            return "El régimen laboral no es válido.";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getRegimenLaboral() {
        return regimenLaboral;
    }
}
