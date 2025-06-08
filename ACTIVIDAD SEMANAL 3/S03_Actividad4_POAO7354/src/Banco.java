public class Banco {

    public static double getTasaInteres() {
        return tasaInteres;
    }

    public static void setTasaInteres(double tasaInteres) {
        Banco.tasaInteres = tasaInteres;
    }

    private static double tasaInteres;

    // Metodo estático para actualizar la tasa de interés
    public static void actualizarTasaInteres(double nuevaTasa) {
        tasaInteres = nuevaTasa;
    }

    // Metodo estático para mostrar la tasa de interés
    public static double mostrarTasaInteres() {
        return tasaInteres;
    }
}
