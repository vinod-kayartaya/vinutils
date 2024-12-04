package co.vinod.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class for converting between Date objects and Strings.
 * Provides methods for date-string conversion with default and custom formats.
 *
 * @author Vinod Kumar Kayartaya
 */
public class DateUtil {

    /** Default date format used when no specific format is provided */
    private static final String DEFAULT_FORMAT = "yyyy-MM-dd";

    /**
     * Converts a Date object to String using the default format (yyyy-MM-dd).
     *
     * @param date the Date object to be converted
     * @return formatted string representation of the date
     * @throws IllegalArgumentException if the input date is null
     */
    public static String toString(Date date) {
        return toString(date, DEFAULT_FORMAT);
    }

    /**
     * Converts a Date object to String using the specified format.
     *
     * @param date the Date object to be converted
     * @param format the date format pattern to be used
     * @return formatted string representation of the date
     * @throws IllegalArgumentException if the input date is null or format is invalid
     */
    public static String toString(Date date, String format) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        if (format == null || format.trim().length() == 0) {
            throw new IllegalArgumentException("Format string cannot be null or empty");
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * Converts a string to Date object using the default format (yyyy-MM-dd).
     *
     * @param str the string to be parsed into a Date object
     * @return parsed Date object
     * @throws IllegalArgumentException if the input string is null or empty
     * @throws ParseException if the string cannot be parsed using the default format
     */
    public static Date toDate(String str) throws ParseException {
        return toDate(str, DEFAULT_FORMAT);
    }

    /**
     * Converts a string to Date object using the specified format.
     *
     * @param str the string to be parsed into a Date object
     * @param format the date format pattern to be used for parsing
     * @return parsed Date object
     * @throws IllegalArgumentException if the input string or format is null or empty
     * @throws ParseException if the string cannot be parsed using the given format
     */
    public static Date toDate(String str, String format) throws ParseException {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
        if (format == null || format.trim().length() == 0) {
            throw new IllegalArgumentException("Format string cannot be null or empty");
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(str);
    }
}