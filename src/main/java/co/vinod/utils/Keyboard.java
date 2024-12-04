package co.vinod.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Utility class for keyboard input operations.
 * Provides static methods to get different types of input from the console.
 *
 * @author Vinod Kumar Kayartaya
 */
public final class Keyboard {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private Keyboard() {
    }

    /**
     * Reads an integer from the console with a prompt message.
     *
     * @param message The prompt message to display
     * @return The integer value entered by the user
     * @throws java.util.InputMismatchException if input is not an integer
     */
    public static int getInt(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Reads a double from the console with a prompt message.
     *
     * @param message The prompt message to display
     * @return The double value entered by the user
     * @throws java.util.InputMismatchException if input is not a double
     */
    public static double getDouble(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    /**
     * Reads a line of text from the console with a prompt message.
     *
     * @param message The prompt message to display
     * @return The string entered by the user
     */
    public static String getString(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    /**
     * Converts a string to a Date object using the default format "yyyy-MM-dd".
     * This method serves as a convenience overload of getDate(String, String).
     *
     * @param message The prompt message to display when getting the date input
     * @return A Date object parsed from the input string
     * @throws InputMismatchException if the input string cannot be parsed into a date
     */
    public static Date getDate(String message) {
        return getDate(message, "yyyy-MM-dd");
    }

    /**
     * Converts a string to a Date object using a specified date format.
     * This method prompts the user with a message and attempts to parse their input
     * into a Date object according to the given format pattern.
     *
     * @param message The prompt message to display when getting the date input
     * @param format The date format pattern (e.g., "yyyy-MM-dd", "MM/dd/yyyy")
     * @return A Date object parsed from the input string
     * @throws InputMismatchException if the input string cannot be parsed into a date
     */
    public static Date getDate(String message, String format) {
        // Create a date formatter with the specified format
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        // Get input string from user using the provided message
        String input = getString(message);

        try {
            // Attempt to parse the input string into a Date object
            return sdf.parse(input);
        } catch (ParseException e) {
            // If parsing fails, wrap the ParseException in an InputMismatchException
            throw new InputMismatchException(e.getMessage());
        }
    }
}