/*
 * COMMAND LINE ARGUMENT INPUT
 *
 * Command line arguments are values passed to a Java program
 * when the program is executed from the terminal.
 *
 * The arguments are received through String args[] in main().
 *
 * args[0] = first argument
 * args[1] = second argument
 * args[2] = third argument
 *
 * Command line arguments are received as String values.
 * Integer.parseInt() is used to convert a String into an integer.
 *
 * Example:
 * java arg_input 10 20
 *
 * args[0] = "10"
 * args[1] = "20"
 */

class arg_input {

    public static void main(String args[]) {

        // Taking two numbers from command line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Displaying the addition
        System.out.println("The addition is: " + (a + b));
    }
}