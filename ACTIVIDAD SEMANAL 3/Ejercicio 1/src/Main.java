//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int sumaEnt = calculadora.sumar(4,5);
        System.out.println("La suma de dos enteros es: "+ sumaEnt);

        int sumaEnt2 = calculadora.sumar(4,5,6);
        System.out.println("La suma de tres enteros es: "+ sumaEnt2);

        double sumadoble = calculadora.sumar(4.5,5.5);
        System.out.println("La suma de dos numeros tipo doble es: "+ sumadoble);
    }

}