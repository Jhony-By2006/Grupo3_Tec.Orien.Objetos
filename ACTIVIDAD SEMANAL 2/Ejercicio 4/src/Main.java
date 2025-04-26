//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TrianguloRectangulo triangulito = new TrianguloRectangulo(3, 4);

        System.out.println("El cateto 1 es: " + triangulito.getCateto1());
        System.out.println("El cateto 2 es: " + triangulito.CarcularHipotenusa());
        System.out.println("El area es: " + triangulito.CalcularPerimetro());

    }
}