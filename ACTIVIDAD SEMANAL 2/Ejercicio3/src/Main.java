//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cilindro c1 = new Cilindro(2, 10);

        double volumen = c1.CalcularVolumen();
        System.out.println("El volumen del cilindro es: " + volumen);

    }
}