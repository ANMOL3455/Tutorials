/*
 * ============================================================
 *                    JAVA DATA TYPES
 * ============================================================
 *
 * A data type specifies what kind of value a variable can
 * store.
 *
 * Java data types are divided into two main categories:
 *
 * 1. Primitive Data Types
 * 2. Non-Primitive / Reference Data Types
 *
 *
 * ============================================================
 * 1. PRIMITIVE DATA TYPES
 * ============================================================
 *
 * Java has 8 primitive data types:
 *
 *     1. byte
 *     2. short
 *     3. int
 *     4. long
 *     5. float
 *     6. double
 *     7. char
 *     8. boolean
 *
 * Primitive data types are built into Java.
 *
 * They are used to store simple values directly.
 *
 *
 * ============================================================
 * 1. BYTE
 * ============================================================
 *
 * Size:
 *     8 bits
 *
 * Range:
 *     -128 to 127
 *
 * byte is useful when we need a small integer value.
 *
 * Example real-world uses:
 *     - Small numeric values
 *     - Sensor values
 *     - Memory-efficient data
 */

public class data_types {

    public static void main(String[] args) {

        // BYTE
        byte age = 19;

        System.out.println("Byte value: " + age);


        /*
         * ====================================================
         * 2. SHORT
         * ====================================================
         *
         * Size:
         *     16 bits
         *
         * Range:
         *     -32,768 to 32,767
         *
         * short can store a larger integer than byte.
         */

        short temperature = 25000;

        System.out.println("Short value: " + temperature);


        /*
         * ====================================================
         * 3. INT
         * ====================================================
         *
         * Size:
         *     32 bits
         *
         * Range:
         *     -2,147,483,648 to 2,147,483,647
         *
         * int is the most commonly used integer data type.
         *
         * Examples:
         *     - Age
         *     - Number of students
         *     - Marks
         *     - Quantity
         *     - IDs
         */

        int students = 500;

        System.out.println("Int value: " + students);


        /*
         * ====================================================
         * 4. LONG
         * ====================================================
         *
         * Size:
         *     64 bits
         *
         * Used when an integer value is larger than the range
         * of int.
         *
         * We normally use L at the end of a long literal.
         */

        long population = 3000000000L;

        System.out.println("Long value: " + population);


        /*
         * ====================================================
         * 5. FLOAT
         * ====================================================
         *
         * Size:
         *     32 bits
         *
         * Used to store decimal values.
         *
         * We normally use f or F after a float value.
         */

        float height = 5.5f;

        System.out.println("Float value: " + height);


        /*
         * ====================================================
         * 6. DOUBLE
         * ====================================================
         *
         * Size:
         *     64 bits
         *
         * double stores decimal values with greater precision
         * than float.
         *
         * It is commonly used for general floating-point
         * calculations.
         */

        double salary = 55000.75;

        System.out.println("Double value: " + salary);


        /*
         * ====================================================
         * 7. CHAR
         * ====================================================
         *
         * Size:
         *     16 bits
         *
         * char stores a single UTF-16 code unit.
         *
         * A char value is written using single quotes.
         *
         * Example:
         *     'A'
         *     'b'
         *     '5'
         */

        char grade = 'A';

        System.out.println("Char value: " + grade);


        /*
         * ====================================================
         * 8. BOOLEAN
         * ====================================================
         *
         * A boolean stores only two values:
         *
         *     true
         *     false
         *
         * Used for logical conditions.
         *
         * Examples:
         *     - Is the user logged in?
         *     - Is the account active?
         *     - Is the payment completed?
         */

        boolean isStudent = true;

        System.out.println("Boolean value: " + isStudent);


        /*
         * ====================================================
         *               NON-PRIMITIVE TYPES
         * ====================================================
         *
         * Non-primitive types are also called reference types.
         *
         * Some important examples are:
         *
         *     1. String
         *     2. Array
         *     3. Class
         *     4. Object
         *     5. Interface
         *     6. Enum
         *
         */


        /*
         * ====================================================
         * 1. STRING
         * ====================================================
         *
         * String is a class used to store text.
         *
         * Example:
         */

        String name = "Anmol Sapkota";

        System.out.println("String: " + name);


        /*
         * ====================================================
         * 2. ARRAY
         * ====================================================
         *
         * An array stores multiple values of the same type.
         *
         * Array indexing starts from 0.
         */

        int[] marks = {80, 75, 90, 85};

        System.out.println("First mark: " + marks[0]);

        System.out.println("All marks:");

        for (int mark : marks) {

            System.out.println(mark);
        }


        /*
         * ====================================================
         * 3. CLASS AND OBJECT
         * ====================================================
         *
         * A class is a blueprint for creating objects.
         *
         * An object is an instance of a class.
         */

        Student student = new Student();

        student.name = "Anmol";
        student.age = 19;

        System.out.println("Student name: " + student.name);
        System.out.println("Student age: " + student.age);


        /*
         * ====================================================
         * 4. ENUM
         * ====================================================
         *
         * An enum is used when a variable should have one
         * value from a fixed set of constants.
         */

        Status result = Status.PASS;

        System.out.println("Result: " + result);


        /*
         * ====================================================
         * 5. INTERFACE
         * ====================================================
         *
         * An interface defines a contract that a class can
         * implement.
         */

        Payment payment = new OnlinePayment();

        payment.pay();


        /*
         * ====================================================
         *              DATA TYPE SUMMARY
         * ====================================================
         */

        System.out.println("\n==============================");
        System.out.println("DATA TYPE SUMMARY");
        System.out.println("==============================");

        System.out.println("\nPrimitive Data Types:");

        System.out.println("byte");
        System.out.println("short");
        System.out.println("int");
        System.out.println("long");
        System.out.println("float");
        System.out.println("double");
        System.out.println("char");
        System.out.println("boolean");

        System.out.println("\nNon-Primitive / Reference Types:");

        System.out.println("String");
        System.out.println("Array");
        System.out.println("Class");
        System.out.println("Object");
        System.out.println("Interface");
        System.out.println("Enum");
    }


    /*
     * ========================================================
     *                  STUDENT CLASS
     * ========================================================
     */

    static class Student {

        String name;
        int age;
    }


    /*
     * ========================================================
     *                       ENUM
     * ========================================================
     */

    enum Status {

        PASS,
        FAIL
    }


    /*
     * ========================================================
     *                    INTERFACE
     * ========================================================
     */

    interface Payment {

        void pay();
    }


    /*
     * ========================================================
     *              IMPLEMENTING THE INTERFACE
     * ========================================================
     */

    static class OnlinePayment implements Payment {

        @Override
        public void pay() {

            System.out.println("Online payment processed.");
        }
    }
}


/*
 * ============================================================
 *                  QUICK REFERENCE TABLE
 * ============================================================
 *
 * Primitive Data Types:
 *
 * ------------------------------------------------------------
 * Type       Size       Example
 * ------------------------------------------------------------
 * byte       8 bits     byte age = 19;
 * short      16 bits    short number = 1000;
 * int        32 bits    int marks = 90;
 * long       64 bits    long population = 3000000000L;
 * float      32 bits    float height = 5.5f;
 * double     64 bits    double salary = 50000.50;
 * char       16 bits    char grade = 'A';
 * boolean    JVM-defined boolean value representation
 *                       boolean passed = true;
 * ------------------------------------------------------------
 *
 *
 * Non-Primitive / Reference Types:
 *
 * String       -> Stores text
 * Array        -> Stores multiple values
 * Class        -> Blueprint for objects
 * Object       -> Instance of a class
 * Interface    -> Defines a contract
 * Enum         -> Fixed set of constants
 *
 *
 * ============================================================
 *                         END
 * ============================================================
 */


