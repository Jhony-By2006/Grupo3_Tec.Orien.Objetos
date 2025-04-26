//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Trabajador
        Trabajador trabajador = new Trabajador("Juan Pérez", 15.0, 40);

        // Calcular y mostrar resultados
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Salario Bruto: " + trabajador.calcularSalarioBruto());
        System.out.println("Impuesto: " + trabajador.calcularImpuesto());
        System.out.println("Salario Neto: " + trabajador.calcularSalarioNeto());

    }
}