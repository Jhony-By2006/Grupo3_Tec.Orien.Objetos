//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movil movil = new Movil(10.0, 5.0, 2.0);

        double espacio = movil.calcularEspacio();
        System.out.println("El espacio recorrido por el móvil es: " + espacio + " metros.");

    }
}