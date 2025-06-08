
public class Main {
    public static void main(String[] args) {
        Producto libro = new Producto("Libreria", 50, 90);
        System.out.println("Producto: " + libro.getNombre());
        System.out.println("Ganancia: $" + libro.calcularGanancia());
    }
}