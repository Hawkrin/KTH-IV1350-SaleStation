package main.util;

/**
 * Prints Log messages to the console
 */
public class ConsoleLogger implements LogHandler {
    private static final ConsoleLogger CONSOLE_LOGGER = new ConsoleLogger();


    /**
     * Creates an instance of the FileLogger
     */
    public ConsoleLogger() {}

    /**
     * Prints and logs the specified string to the console
     * 
     * @param message the string that will be output
     */
    @Override
    public void log(Exception exception) {
        StringBuilder logBuilder = new StringBuilder();
        logBuilder.append("An Error Occured");
        logBuilder.append("\n @ " + timeRightNow);
        logBuilder.append("\n and an Exception was thrown: ");
        logBuilder.append(exception.getMessage());
        System.out.println(logBuilder.toString());
        exception.printStackTrace(System.out);  
    }
        
}
    

