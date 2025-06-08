public class Cilindro {
    private double radio;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cilindro(double radio, double altura){
        this.altura = altura;
        this.radio = radio;

    }
    public double CalcularVolumen(){
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}
