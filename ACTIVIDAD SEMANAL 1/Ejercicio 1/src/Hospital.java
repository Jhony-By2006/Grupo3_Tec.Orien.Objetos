// Clase Hospital
import java.util.ArrayList;
import java.util.List;

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