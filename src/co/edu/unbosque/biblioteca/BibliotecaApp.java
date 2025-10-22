package co.edu.unbosque.biblioteca;

import co.edu.unbosque.biblioteca.logger.AppLogger;
import java.util.logging.Logger;

public final class BibliotecaApp {
    private static final Logger LOGGER = AppLogger.getLogger();

    private BibliotecaApp() {
        throw new UnsupportedOperationException("Clase utilitaria - no instanciable");
    }

    public static void main(final String[] args) {
        LOGGER.info("Inicio de la aplicación de Biblioteca...");

        final Biblioteca biblioteca = new Biblioteca();

        final Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        final Libro libro2 = new Libro("1984", "George Orwell");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.listarCatalogo();

        LOGGER.info("Fin de la ejecución principal");
    }
}