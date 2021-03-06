package main.view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * This class shows the error messages to the user
 */
public class ErrorMessageHandler {
    LocalDateTime timeRightNow = LocalDateTime.now();
    private static final ErrorMessageHandler ERROR_MESSAGE = new ErrorMessageHandler();

    /**
     * Creates an instance of the ErrorMessageHandler
     */
    public ErrorMessageHandler() throws UnsupportedOperationException {}

    /**
     * Gets the errorMessage
     * 
     * @return the error message
     */
    public static ErrorMessageHandler getErrorMessage(){ return ERROR_MESSAGE; }

    /**
     * Gets the date and time of today
     * 
     * @return the date and time of today
     */
    public String getDateAndTime() {
        DateTimeFormatter format = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        return timeRightNow.format(format); 
    } 
    
    /**
     * Displays the specified error message.
     * 
     * @param msg The error message to display.
     */
    public void displayErrorMessage(String msg) {
        StringBuilder occuredError = new StringBuilder();
        occuredError.append("******WARNING******\n");
        occuredError.append(getDateAndTime());
        occuredError.append("\n");
        occuredError.append("ERROR OCCURED ");
        occuredError.append("\n");
        occuredError.append(msg);
        occuredError.append("\n");
        occuredError.append("*******************");
        System.out.println(occuredError.toString());
    }
}