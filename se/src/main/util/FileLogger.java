package main.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Prints Log messages as a text file
 */
public class FileLogger implements LogHandler {
    private static final FileLogger FILE_LOGGER = new FileLogger();
    private static final String NAME_OF_LOG_FILE = "SaleStation-log.txt";
    private PrintWriter logFile;
    
    /**
     * Creates an instance of the FileLogger
     */
    public FileLogger() {
        try {
            logFile = new PrintWriter(new FileWriter(NAME_OF_LOG_FILE), true);
        } 
        catch (IOException exception) {
            System.out.println("Error while creating the logger.");
            exception.printStackTrace();
        }
    }

    /**
     * Prints and logs the specified string to a txt file.
     * 
     * @param message the string that will be logged
     */
    @Override
    public void log(Exception exception) {
        StringBuilder logBuilder = new StringBuilder();
        logBuilder.append("An Error Occured");
        logBuilder.append("\n @ " + timeRightNow);
        logBuilder.append("\n and an Exception was thrown: ");
        logBuilder.append(exception.getMessage());
        logFile.println(logBuilder.toString());
        exception.printStackTrace(logFile);  
    }
    
}