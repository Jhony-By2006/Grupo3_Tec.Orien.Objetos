/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1.semana.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Etu Fashin
 */
public class Hospital {
    private List<Persona> personasAtendidas;

    public Hospital() {
        this.personasAtendidas = new ArrayList<>();
    }

    public void registrarPersona(Persona persona) {
        personasAtendidas.add(persona);
        System.out.println("Persona registrada: " + persona);
    }

    public void listarPersonasAtendidas() {
        System.out.println("Personas atendidas:");
        for (Persona persona : personasAtendidas) {
            System.out.println(persona);
        }
    }
}
