//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 500.0, 750.0);

        System.out.println("La ganancia del producto " + producto.getNombre() + " es: " + producto.calcularGanancia());
    }

}