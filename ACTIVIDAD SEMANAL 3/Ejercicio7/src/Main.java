import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division = new Division();

        System.out.print("Ingresa el numerador: ");
        double numerador = scanner.nextInt();

        System.out.print("Ingresa el denominador: ");
        double denominador = scanner.nextInt();

        double r = division.dividir(numerador, denominador);
        System.out.println("Resultado: " + r);

        scanner.close();

    }
}