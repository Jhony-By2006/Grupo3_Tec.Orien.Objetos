import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ValidadEdad validador = new ValidadEdad();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad que tienes: ");
        int edad = scanner.nextInt();

        try{
            validador.verificarEdad(edad);
        }catch (IllegalArgumentException e){
            System.out.println("Excepción capturada " + e.getMessage());
        }

        scanner.close();

    }
}