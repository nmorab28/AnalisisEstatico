package co.edu.unbosque.biblioteca.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class AppLogger {
    private static final Logger LOGGER = Logger.getLogger("BibliotecaLogger");

    static {
        final ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        LOGGER.addHandler(handler);
        LOGGER.setUseParentHandlers(false);
        LOGGER.setLevel(Level.ALL);
    }

    private AppLogger() {
        throw new UnsupportedOperationException("Clase utilitaria - no instanciable");
    }

    public static void logInfo(final String mensaje) {
        LOGGER.info(mensaje);
    }

    public static void logError(final String mensaje, final Exception exception) {
        LOGGER.log(Level.SEVERE, mensaje, exception);
    }

    public static void logDebug(final String mensaje) {
        LOGGER.fine(mensaje);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}