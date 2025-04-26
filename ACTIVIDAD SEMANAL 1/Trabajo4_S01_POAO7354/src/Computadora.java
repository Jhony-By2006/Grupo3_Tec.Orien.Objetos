public class Computadora {
    private String marca;
    private String modelo;
    private String procesador;
    private int ram;
    private int precio;
    private int stock;

    public Computadora(String marca, String modelo, String procesador, int ram, int precio, int stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.ram = ram;
        this.precio = precio;
        this.stock = stock;
    }
    public boolean validarStockMinimo() {
        if (stock < 5) {
            System.out.println("El stock de " + marca + " " + modelo + " es menor al mínimo permitido.");
            return false;
        } else {
            System.out.println("El stock de " + marca + " " + modelo + " es suficiente.");
            return true;
        }

    }
    @Override
    public String toString() {
        return "Computadora :" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", ram=" + ram +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
