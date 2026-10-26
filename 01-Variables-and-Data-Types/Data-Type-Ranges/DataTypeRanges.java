
/*
 * Folder: 01-Variables-and-Data-Types/Data-Type-Ranges
 * File: DataTypeRanges.java
 * Description: Exploring the ranges of Java numeric data types.
 */

public class DataTypeRanges {

    public static void main(String[] args) {

        // Display the minimum and maximum values of byte.
        System.out.println("BYTE RANGE");
        System.out.println("Minimum: " + Byte.MIN_VALUE);
        System.out.println("Maximum: " + Byte.MAX_VALUE);

        // Display the minimum and maximum values of short.
        System.out.println();
        System.out.println("SHORT RANGE");
        System.out.println("Minimum: " + Short.MIN_VALUE);
        System.out.println("Maximum: " + Short.MAX_VALUE);

        // Display the minimum and maximum values of int.
        System.out.println();
        System.out.println("INTEGER RANGE");
        System.out.println("Minimum: " + Integer.MIN_VALUE);
        System.out.println("Maximum: " + Integer.MAX_VALUE);

        // Display the minimum and maximum values of long.
        System.out.println();
        System.out.println("LONG RANGE");
        System.out.println("Minimum: " + Long.MIN_VALUE);
        System.out.println("Maximum: " + Long.MAX_VALUE);

        // Display the minimum and maximum values of float.
        System.out.println();
        System.out.println("FLOAT RANGE");
        System.out.println("Minimum: " + Float.MIN_VALUE);
        System.out.println("Maximum: " + Float.MAX_VALUE);

        // Display the minimum and maximum values of double.
        System.out.println();
        System.out.println("DOUBLE RANGE");
        System.out.println("Minimum: " + Double.MIN_VALUE);
        System.out.println("Maximum: " + Double.MAX_VALUE);
    }
}

/*
 * Expected output (scientific notation may vary):
 *
 * BYTE RANGE
 * Minimum: -128
 * Maximum: 127
 *
 * SHORT RANGE
 * Minimum: -32768
 * Maximum: 32767
 *
 * INTEGER RANGE
 * Minimum: -2147483648
 * Maximum: 2147483647
 *
 * LONG RANGE
 * Minimum: -9223372036854775808
 * Maximum: 9223372036854775807
 *
 * FLOAT RANGE
 * Minimum: 1.4E-45
 * Maximum: 3.4028235E38
 *
 * DOUBLE RANGE
 * Minimum: 4.9E-324
 * Maximum: 1.7976931348623157E308
 */
