import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
    //Ejercicio: Crea una clase Archivo con un metodo leerArchivo(String nombreArchivo) que use
    //throws IOException. En el main, maneja la excepción con try-catch.

        Archivo archivo = new Archivo();
        String ruta = "D:\\Java\\TÉCNICAS DE PROGRAM.ORIE. OBJ\\prueva.txt";  // ruta archivo

        try {
            archivo.leerArchivo(ruta);
        } catch (IOException e) {
            // Manejo de la excepción: mostramos un mensaje de error
            System.err.println("Error leyendo el archivo '" + ruta + "': " + e.getMessage());
        }
    }
}