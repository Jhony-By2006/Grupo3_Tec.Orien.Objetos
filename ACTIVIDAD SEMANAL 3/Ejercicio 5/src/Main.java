import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Tipos de motor ---> V1,V2,V3....V8");
        Auto auto = new Auto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor que quiere buscar: ");
        String tipoMotor = scanner.nextLine();

        Auto.Motor motor = auto.new Motor(tipoMotor);
        motor.mostrarContenido();
    }
}