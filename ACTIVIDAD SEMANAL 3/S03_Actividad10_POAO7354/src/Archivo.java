import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {

    public void leerArchivo(String nombreArchivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }
}