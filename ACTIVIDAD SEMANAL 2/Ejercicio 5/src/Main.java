//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConversionTemperatura conversion = new ConversionTemperatura(25.0);
        System.out.println("--------------------------------");
        System.out.println("Temperatura en Celsius: " + conversion.getTemperaturaCelsius());
        System.out.println("--------------------------------");
        System.out.println("Temperatura en Fahrenheit: " + conversion.convertirF());

    }
}