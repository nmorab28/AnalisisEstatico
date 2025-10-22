package co.edu.unbosque.biblioteca;

public class Libro {
    private final String titulo;
    private final String autor;

    public Libro(final String titulo, final String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String obtenerInformacion() {
        return String.format("Libro: %s - Autor: %s", titulo, autor);
    }
}