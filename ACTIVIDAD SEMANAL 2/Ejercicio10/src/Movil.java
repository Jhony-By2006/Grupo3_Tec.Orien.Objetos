public class Movil {
    private double velocidadInicial;
    private double tiempo;
    private double aceleracion;

    public Movil(double velocidadInicial, double tiempo, double aceleracion) {
        this.velocidadInicial = velocidadInicial;
        this.tiempo = tiempo;
        this.aceleracion = aceleracion;
    }
    public double calcularEspacio() {
        return (velocidadInicial * tiempo) + (0.5 * aceleracion * tiempo * tiempo);
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

}
