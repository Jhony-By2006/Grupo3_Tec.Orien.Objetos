
public class Main {
    public static void main(String[] args) {

        //Ejercicio:  Crea  un  programa  que  pida  al  usuario  ingresar  dos  números  enteros  y  realice  su
        //división.  Maneja  las  excepciones  ArithmeticException  (división  por  cero)  y
        //InputMismatchException (si el usuario ingresa un valor no numérico).

        double numerador;
        double denominador;
        boolean validacion = false;
        while (validacion != true) {
            System.out.print("Ingrese el numerador: ");
            String num = System.console().readLine();
            numerador = Double.parseDouble(num);
            System.out.print("Ingrese el denominador: ");
            String den = System.console().readLine();
            denominador = Double.parseDouble(den);
            Calculadora c =  Calculadora.getInstance(numerador, denominador);
            c.dividir();
            System.out.printf("Desea realizar otra division? (S/N): ");
            String respuesta = System.console().readLine();
            if (respuesta == "N" || respuesta == "n") {
                validacion = true;
            } else if (respuesta == "S" || respuesta == "s") {
                System.out.println(" Continuando...");
            }
        }

    }
}