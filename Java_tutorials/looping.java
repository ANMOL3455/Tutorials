/*
There are mainly 4 types of looping statements in Java:

1. while loop
2. do-while loop
3. for loop
4. for each loop [ we will cover it later ]


1. while loop

Syntax:

while (condition) {
    statement;
}

The while loop checks the condition before executing
the statements inside the loop.

If the condition is false at the beginning, the loop
will not execute even once.


2. do-while loop

Syntax:

do {
    statement;
} while (condition);

The do-while loop executes the statement first and
then checks the condition.

Therefore, a do-while loop always executes at least once.


3. for loop

Syntax:

for (initialization; condition; increment/decrement) {
    statement;
}

The for loop is commonly used when we know how many
times we want to execute a block of code.
*/

import java.util.Scanner;  // for input taking

class Looping {

    public static void main(String args[]) {

        // Creating a Scanner object for taking input.
        Scanner input_taker = new Scanner(System.in);

        // Using a simple while loop.
        System.out.println("Using simple while loop:");

        int a = 1;

        while (a <= 10) {
            System.out.println("Anmol");
            a++;
        }


        // Using a do-while loop.
        System.out.println("\nUsing do-while loop:");

        int x = 1;

        do {
            System.out.println("Anmol");
            x++;
        } while (x <= 10);


        // Using a simple for loop.
        System.out.println("\nUsing simple for loop:");

        for (int p = 0; p <= 10; p++) {
            System.out.println("This is a for loop");
        }


        // Closing the Scanner object.
        input_taker.close();
    }
}
```
