public class Division {
    public double dividir(double n, double d) {
        try {
            return n / d;
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
    }
}
