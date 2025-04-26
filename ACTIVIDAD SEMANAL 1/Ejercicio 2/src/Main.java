import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el régimen laboral (CAS, 276 o 728):");
        String regimen = scanner.nextLine();

        Persona persona = new Persona(nombre, regimen);

        String resultadoValidacion = persona.validarRegimen();
        System.out.println("El régimen laboral de " + persona.getNombre() + ": " + resultadoValidacion);

        scanner.close();
    }
}