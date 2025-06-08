//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GasIdeal gas = new GasIdeal(300, 2, 10);
        double presion = gas.calcularP();

        System.out.println("La presión del gas ideal es: " + presion + " atm");
    }
}
