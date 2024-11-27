package co.vinod.utils;

import java.util.Scanner;

/**
 * Utility class for keyboard input operations.
 * Provides static methods to get different types of input from the console.
 */
public final class Keyboard {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private Keyboard() {
    }

    /**
     * Reads an integer from the console with a prompt message.
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
     * @param message The prompt message to display
     * @return The string entered by the user
     */
    public static String getString(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}