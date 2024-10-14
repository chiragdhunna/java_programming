package customLogger;
import java.util.logging.*;

class CustomFormatter extends Formatter {

    // ANSI escape codes for colored output
    private static final String GREY = "\u001B[37m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String BOLD_RED = "\u001B[1;31m";
    private static final String RESET = "\u001B[0m";

    @Override
    public String format(LogRecord record) {
        String levelColor;

        // Apply color based on the log level
        switch (record.getLevel().getName()) {
            case "SEVERE":
                levelColor = BOLD_RED;
                break;
            case "WARNING":
                levelColor = YELLOW;
                break;
            case "INFO":
                levelColor = GREY;
                break;
            case "FINE":
            case "FINER":
            case "FINEST":
                levelColor = GREY;
                break;
            default:
                levelColor = RESET;
                break;
        }

        // Capture the source line number using a Throwable
        int lineNumber = -1;
        try {
            Throwable t = new Throwable();
            StackTraceElement[] elements = t.getStackTrace();
            for (StackTraceElement element : elements) {
                if (element.getClassName().equals(record.getSourceClassName())) {
                    lineNumber = element.getLineNumber();
                    break;
                }
            }
        } catch (Exception ex) {
            // Default to -1 if capturing the line number fails
        }

        // Format the log message with color
        return String.format(
            levelColor + "%1$tF %1$tT - %2$s - %3$s - %4$s (%5$s:%6$d)" + RESET + "\n",
            new java.util.Date(record.getMillis()),            // Timestamp
            record.getLoggerName(),                            // Logger name
            record.getLevel().getName(),                       // Log level
            formatMessage(record),                             // Log message
            record.getSourceClassName(),                       // Class name
            lineNumber                                         // Captured line number
        );
    }
}

public class CustomLogger {

    private static final Logger logger = Logger.getLogger("MyApp");

    public CustomLogger(){
        // Set logger level
        logger.setLevel(Level.ALL);

        // Create console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL); // Set handler level
        consoleHandler.setFormatter(new CustomFormatter()); // Set custom formatter

        // Remove default handlers
        logger.setUseParentHandlers(false);

        // Add custom handler to logger
        logger.addHandler(consoleHandler);
    }

    public void finest(String message){
        logger.finest(message);     // FINEST (Grey)
    }
    
    public void finer(String message){
        logger.finer(message);       // FINER (Grey)
    }

    public void fine(String message){
        logger.fine(message);         // FINE (Grey)
    }

    public void info(String message){
        logger.info(message);         // INFO (Grey)
    }

    public void warning(String message){
        logger.warning(message);   // WARNING (Yellow)
    }

    public void severe(String message){
        logger.severe(message);     // SEVERE (Bold Red)
    }
}
