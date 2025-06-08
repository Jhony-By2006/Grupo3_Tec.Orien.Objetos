//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConversionLongitud conversion = new ConversionLongitud(10);

        double pies = conversion.convertirPies();
        double pulgadas = conversion.convertirPulgadas();

        System.out.println("Metros: " + conversion.getMetros());
        System.out.println("En pies: " + pies);
        System.out.println("En pulgadas: " + pulgadas);
    }
}