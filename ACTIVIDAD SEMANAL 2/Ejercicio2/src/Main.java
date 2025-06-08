//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Numero numero = new Numero(3);
        System.out.println("--------------------------------------------------");
        System.out.println("Numero: " + numero.getNumeroReal());
        System.out.println("--------------------------------------------------");
        System.out.println("Raiz Cuadrada: " + numero.raizCuadrada());
        System.out.println("--------------------------------------------------");
        System.out.println("Cubo: " + numero.calcularcubo());
        System.out.println("--------------------------------------------------");
    }
}