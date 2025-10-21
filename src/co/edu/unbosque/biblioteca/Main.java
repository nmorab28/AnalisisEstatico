package co.edu.unbosque.biblioteca;

import co.edu.unbosque.biblioteca.logger.AppLogger;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = AppLogger.getLogger();

    public static void main(String[] args) {
        logger.info("Inicio de la aplicación de Biblioteca...");

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("1984", "George Orwell");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.listarCatalogo();

        logger.info("Fin de la ejecución principal");
        //Prueba2
    }
}