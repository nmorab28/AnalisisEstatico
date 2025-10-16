package co.edu.unbosque.biblioteca;

class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
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
        return "Libro: " + titulo + " - Autor: " + autor;
    }
}




