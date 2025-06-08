public class Producto {
    private String nombre;
    private double precioCompra;
    private double precioVenta;

    public Producto(String nombre, double precioCompra, double precioVenta) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public double calcularGanancia() {
        return precioVenta - precioCompra;
    }

    public String getNombre() {
        return nombre;
    }
}