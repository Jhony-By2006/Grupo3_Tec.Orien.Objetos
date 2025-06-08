
public class ValidadEdad {
    public void verificarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("La edad debe ser mayor o igual a 18 años.");
        }
        else{
            System.out.println("La edad es valida: " + edad);
        }
    }
}