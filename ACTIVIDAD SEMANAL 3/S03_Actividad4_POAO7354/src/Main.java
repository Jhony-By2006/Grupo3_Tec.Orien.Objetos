public class Main {
    public static void main(String[] args) {

    //Ejercicio: Crea una clase Banco con una variable static llamada tasaInteres. Luego, define un
    //metodo static que permita actualizar la tasa de interés y otro para mostrarla

        System.out.print("ingrese la tasa de interes: ");
        String tasaInteres = System.console().readLine();
        // Convertir la entrada a un número decimal
        double tasaInteresDecimal = Double.parseDouble(tasaInteres);
        Banco.setTasaInteres(tasaInteresDecimal);
        // Mostrar la tasa de interés
        System.out.println("La tasa de interés actual es: " + Banco.mostrarTasaInteres());
        // Actualizar la tasade interés
        System.out.print("ingrese la nueva tasa de interes: ");
        String nuevaTasaInteres = System.console().readLine();
        // Convertir la entrada a un número decimal
        double nuevaTasaInteresDecimal = Double.parseDouble(nuevaTasaInteres);
        Banco.actualizarTasaInteres(nuevaTasaInteresDecimal);
        // Mostrar la tasa de interés
        System.out.println("La tasa de interés actual es: " + Banco.mostrarTasaInteres());
    }
}