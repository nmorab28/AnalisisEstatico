package co.edu.unbosque.biblioteca;

import co.edu.unbosque.biblioteca.logger.AppLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Biblioteca {
    private static final Logger LOGGER = AppLogger.getLogger();
    private final List<Libro> catalogo = new ArrayList<>();

    public Biblioteca() {
        new ArrayList<Libro>();
    }

    public void agregarLibro(final Libro libro) {
        try {
            catalogo.add(libro);
            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info(String.format("Libro agregado al catálogo: %s", libro.obtenerInformacion()));
            }
        } catch (IllegalArgumentException | IllegalStateException exception) {
            LOGGER.log(Level.SEVERE, "Error al agregar libro", exception);
        } finally {
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.fine("Finalizó el intento de agregar libro.");
            }
        }
    }

    public void listarCatalogo() {
        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info("Listando catálogo de libros...");
        }
        for (final Libro libro : catalogo) {
            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info(libro.obtenerInformacion());
            }
        }
    }

    public void agregarLibroConVerificacion(final Libro libro) {
        if (catalogo.contains(libro)) {
            if (LOGGER.isLoggable(Level.WARNING)) {
                LOGGER.warning("El libro ya existe en el catálogo.");
            }
        } else {
            catalogo.add(libro);
            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.info(String.format("Libro agregado con verificación: %s", libro.obtenerInformacion()));
            }
        }
    }
}