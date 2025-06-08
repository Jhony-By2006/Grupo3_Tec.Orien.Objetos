import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        // Mostrar la interfaz de login
        LoginInterfaz login = new LoginInterfaz();
        login.setVisible(true);

        // Esperar hasta que el login sea exitoso
        while (login.isVisible()) {
            try {
                Thread.sleep(100); // Pausa breve para evitar un bucle intenso
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Verificar si el login fue exitoso
        if (login.isLoginExitoso()) {
            Archivo archivo = new Archivo();
            String ruta = "D:\\Java\\TÉCNICAS DE PROGRAM.ORIE. OBJ\\prueva.txt"; // Ruta del archivo

            try {
                archivo.leerArchivo(ruta);
            } catch (IOException e) {
                System.err.println("Error leyendo el archivo '" + ruta + "': " + e.getMessage());
            }
        } else {
            System.out.println("El usuario no inició sesión correctamente.");
        }
    }
}