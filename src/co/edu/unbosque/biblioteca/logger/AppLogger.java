package co.edu.unbosque.biblioteca.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLogger {
    private static final Logger logger = Logger.getLogger("BicliotecaLogger");

    static {
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
    }

    private AppLogger() {
        throw new UnsupportedOperationException("Clase utilitaria - no instanciable");
    }

    public static void logInfo(String mensaje) {
        logger.info(mensaje);
    }

    public static void logError(String mensaje, Exception e) {
        logger.log(Level.SEVERE, mensaje, e);
    }

    public static void logDebug(String mensaje) {
        logger.fine(mensaje);
    }

    public static Logger getLogger() {
        return logger;
    }
}