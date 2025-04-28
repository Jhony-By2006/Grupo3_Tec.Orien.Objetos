/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1.semana.pkg1;

/**
 *
 * @author Etu Fashin
 */
public class Persona {
    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;

    public Persona(String nombre, String tipoDocumento, String numeroDocumento) {
        if (!(tipoDocumento == "DNI" || tipoDocumento == "Carnet de Extranjería")) {
            System.out.println("Error: Tipo de documento no válido. Debe ser 'DNI' o 'Carnet de Extranjería'.");
            return;
        }
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tipo de Documento: " + tipoDocumento + ", Número de Documento: " + numeroDocumento;
    }
}
