/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg6.semana.pkg3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Etu Fashin
 */
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
