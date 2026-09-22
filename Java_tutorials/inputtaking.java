// classes imported to use inside the code
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class inputtaking{
    public static void main(String[] args) throws IOException {
        
        // METHOD 1: USING THE SCANNER CLASS
        // Scanner parses primitives directly and uses System.in as its source.
        Scanner inputfunc = new Scanner(System.in);
        
        System.out.println("=== METHOD 1: SCANNER CLASS ===");
        
        System.out.print("Please enter the first number: ");
        int a = inputfunc.nextInt();
        
        System.out.print("Please enter the second number: ");
        int b = inputfunc.nextInt();
        
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));

        System.out.print("ENTER A DOUBLE NUMBER: ");
        double number = inputfunc.nextDouble();
        System.out.println("The double number is: " + number);

        // Discrepancy between next() and nextLine():
        // nextInt() or nextDouble() only capture the value, leaving the Enter key (\n) 
        // in the input stream buffer. We clear it using nextLine() before taking a String.
        inputfunc.nextLine();  // Consumes the leftover newline placeholder

        System.out.print("ENTER YOUR SECTION NAME: ");
        String section = inputfunc.nextLine();
        System.out.println("The section entered is: " + section);


        // METHOD 2: USING THE BUFFEREDREADER CLASS
        // BufferedReader reads text efficiently from a character-input stream.
        // Note: It requires throwing or catching an IOException.
		
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n=== METHOD 2: BUFFEREDREADER CLASS ===");
        
        System.out.print("ENTER YOUR NAME USING BUFFEREDREADER: ");
        // BufferedReader reads an entire line as a String
        String nameBuffer = reader.readLine(); 
        System.out.println("Hello, " + nameBuffer + "!");

        System.out.print("ENTER AN INTEGER USING BUFFEREDREADER: ");
        // Because BufferedReader reads everything as a String, we must parse numbers manually:
        int numBuffer = Integer.parseInt(reader.readLine());
        
        // Fixed syntax error from original code (changed comma to plus sign for concatenation)
        System.out.println("OUTPUTS ARE: " + numBuffer);

        // Always good practice to close resources when done
        inputfunc.close();
        // reader.close();
    }
}