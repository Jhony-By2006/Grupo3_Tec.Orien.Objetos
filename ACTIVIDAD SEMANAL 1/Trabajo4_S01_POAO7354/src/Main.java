import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // en una tinda de computadoras se requiere registrar las
        // caracteristicas de las computadoras que se venden y validar
        // que el minimo de stock sea de 5 unidades

        ArrayList<Computadora> computadoras = new ArrayList<Computadora>();
        // Agregar computadoras a la lista :
        computadoras.add(new Computadora("HP", "Pavilion", "Intel i5", 16, 512, 10));
        computadoras.add(new Computadora("Dell", "Inspiron", "Intel i7", 32, 1024, 3));
        computadoras.add(new Computadora("Lenovo", "ThinkPad", "AMD Ryzen 5", 16, 512, 8));
        computadoras.add(new Computadora("Asus", "ZenBook", "Intel i9", 64, 2048, 2));
        computadoras.add(new Computadora("Acer", "Aspire", "AMD Ryzen 7", 32, 1024, 6));

        // Recorrer la lista y
        for (int i = 0; i < 5; i++) {
            System.out.println("Computadora " + (i + 1) + ": " + computadoras.get(i).toString());
            if (computadoras.get(i).validarStockMinimo()) {
                System.out.println("Correcto");
            } else {
                System.out.println("es insuficiente. Debe ser al menos 5 unidades");
            }
        }

    }
}