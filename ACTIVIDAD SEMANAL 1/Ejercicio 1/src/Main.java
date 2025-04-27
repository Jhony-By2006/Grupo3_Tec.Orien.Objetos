public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        try {
            Persona persona1 = new Persona("Juan Pérez", "DNI", "12345678");
            Persona persona2 = new Persona("María López", "Carnet de Extranjería", "CE987654");

            hospital.registrarPersona(persona1);
            hospital.registrarPersona(persona2);

            hospital.listarPersonasAtendidas();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        //hola mundo , esto es un comentario
        // Esto es un comentario adicional
    }
}