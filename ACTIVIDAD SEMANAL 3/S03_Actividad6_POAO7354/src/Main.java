
public class Main {
    public static void main(String[] args) {

//Ejercicio: Crea una clase Libro que tenga una clase interna Pagina. La clase Pagina debe tener un
// metodo mostrarContenido() que imprima un mensaje con el contenido de la página..
// Creamos un libro con título, autor y contenido de su única página
    Libro miLibro = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "En un lugar de La Mancha, de cuyo nombre no quiero acordarme...");
    miLibro.agregarpagina("Don Quijote de la Mancha es una novela escrita por Miguel de Cervantes.");
        System.out.println("Contenido de la página 0");
        System.out.println("Contenido de la página 1");
        int n = Integer.parseInt(System.console().readLine());
        miLibro.mostrarContenido(n);
    }
}