package co.edu.unbosque.biblioteca;

import co.edu.unbosque.biblioteca.logger.AppLogger;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Biblioteca {
    private static final Logger logger = AppLogger.getLogger();
    private ArrayList<Libro> catalogo = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        try {
            catalogo.add(libro);
            logger.info("Libro agregado al catálogo: " + libro.obtenerInformacion());
        } catch (Exception e) {
            logger.severe("Error al agregar libro: " + e.getMessage());
        } finally {
            logger.fine("Finalizó el intento de agregar libro.");
        }
    }

    public void listarCatalogo() {
        logger.info("Listando catálogo de libros...");
        for (Libro libro : catalogo) {
            logger.info(libro.obtenerInformacion());
        }
    }

    public void agregarLibro1(Libro libro) {
        if (catalogo.contains(libro)) {
            logger.warning("El libro ya existe en el catálogo.");
        } else {
            catalogo.add(libro);
            logger.info("Libro agregado con verificación: " + libro.obtenerInformacion());
        }
    }
}