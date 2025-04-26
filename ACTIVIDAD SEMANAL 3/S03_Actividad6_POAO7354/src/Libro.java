import java.util.List;
import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas = new ArrayList<>();
    private int numeroPagina =0 ;
    // Ahora recibimos también el texto de la página
    public Libro(String titulo, String autor, String contenidoPagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas.add(new Pagina(contenidoPagina));
    }

    public void mostrarContenido(int numeroPagina) {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + paginas.size());
        System.out.println("_____________________________");

        for (int i = 0; i < paginas.size(); i++) {

            if (i == numeroPagina) {
                System.out.println("Página " + (i+1) + ":");
                paginas.get(i).mostrarContenido();

            }
        }
    }
    public void agregarpagina(String contenido) {

        this.paginas.add(new Pagina(contenido));
        numeroPagina =+ 1;
    }

    // inner class con estado
    class Pagina {
        private String contenido;

        public Pagina(String contenido) {
            this.contenido = contenido;
        }

        public void mostrarContenido() {
            System.out.println("Contenido de la página: " + contenido);
        }
    }
}