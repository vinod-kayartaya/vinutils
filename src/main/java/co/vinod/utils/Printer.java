package co.vinod.utils;

/**
 * Utility class for printing object fields using reflection.
 */
public final class Printer {

    /**
     * Prints all fields of an object except those specified to exclude.
     * Uses reflection to access fields, including private ones.
     *
     * @param obj Object to print fields from
     * @param fieldsToExclude Variable number of field names to exclude from printing
     * @throws RuntimeException if reflection operations fail
     */
    public static void print(Object obj, String... fieldsToExclude) {
        if (obj == null) {
            return;
        }
        try {
            System.out.println("data in the give object of type " + obj.getClass().getName());
            outer_loop:
            for (var f : obj.getClass().getDeclaredFields()) {
                // Skip excluded fields
                for (var fieldToExclude : fieldsToExclude) {
                    if (f.getName().equals(fieldToExclude)) {
                        continue outer_loop;
                    }
                }
                // Temporarily enable access to private fields
                f.setAccessible(true);
                System.out.printf("%-20s: %s\n", f.getName(), f.get(obj));
                f.setAccessible(false);
            }
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}