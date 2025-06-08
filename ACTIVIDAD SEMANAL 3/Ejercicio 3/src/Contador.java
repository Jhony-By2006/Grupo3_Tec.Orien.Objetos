public class Contador {
    private static int totalObjetos = 0;

    public Contador() {
        totalObjetos++;
    }

    public static void mostrarTotal(){
        System.out.println("Total de objetos son: " + totalObjetos);
    }
}
