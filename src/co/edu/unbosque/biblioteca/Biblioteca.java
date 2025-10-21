package co.edu.unbosque.biblioteca;

import co.edu.unbosque.biblioteca.logger.AppLogger;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Biblioteca {
    private static final Logger logger = AppLogger.getLogger();
    private final ArrayList<Libro> catalogo = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        try {
            catalogo.add(libro);
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info("Libro agregado al catálogo: " + libro.obtenerInformacion());
            }
        } catch (RuntimeException e) {
            logger.severe("Error al agregar libro: " + e.getMessage());
        } finally {
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                logger.fine("Finalizó el intento de agregar libro.");
            }
        }
    }

    public void listarCatalogo() {
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info("Listando catálogo de libros...");
        }
        for (Libro libro : catalogo) {
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(libro.obtenerInformacion());
            }
        }
    }

    public void agregarLibro1(Libro libro) {
        if (catalogo.contains(libro)) {
            if (logger.isLoggable(java.util.logging.Level.WARNING)) {
                logger.warning("El libro ya existe en el catálogo.");
            }
        } else {
            catalogo.add(libro);
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info("Libro agregado con verificación: " + libro.obtenerInformacion());
            }
        }
    }
}