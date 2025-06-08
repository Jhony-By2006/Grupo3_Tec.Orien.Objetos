public class GasIdeal {
    private double temperatura; // en Kelvin
    private double numeroDeMoles;
    private double volumen; // en litros

    public double getNumeroDeMoles() {
        return numeroDeMoles;
    }

    public void setNumeroDeMoles(double numeroDeMoles) {
        this.numeroDeMoles = numeroDeMoles;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    // Constructor
    public GasIdeal(double temperatura, double numeroDeMoles, double volumen) {
        this.temperatura = temperatura;
        this.numeroDeMoles = numeroDeMoles;
        this.volumen = volumen;
    }
    public double calcularP() {
        final double R = 0.0821; // Constante de los gases ideales (L·atm)/(mol·K)
        return (numeroDeMoles * R * temperatura) / volumen;
    }
}
