public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;

    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }
    public double CalcularArea(){
        return (cateto1 * cateto2) / 2;
    }
    public double CarcularHipotenusa(){
        return Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
    }
    public double CalcularPerimetro(){
        return cateto1 + cateto2 + CarcularHipotenusa();
    }



}
