
public class Cliente {
    private String nombre;
    private double volumenCompras;

    public Cliente(String nombre, double volumenCompras) {
        this.nombre = nombre;
        this.volumenCompras = volumenCompras;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVolumenCompras() {
        return volumenCompras;
    }

    public String determinarTipo() {
        if (volumenCompras >= 1000) {
            return "ORO";
        } else if (volumenCompras >= 500) {
            return "PLATA";
        } else {
            return "BRONCE";
        }
    }
}