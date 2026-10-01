/*
 * CONTROL FLOW STATEMENTS
 *
 * Control flow statements control the order in which
 * statements are executed in a program.
 *
 * SELECTION / CONDITIONAL STATEMENTS
 *
 * 1. if
 * 2. if-else
 * 3. else-if
 * 4. switch-case
 *
 *
 * CONDITIONAL STATEMENT:
 * A conditional statement is used to execute different
 * blocks of code depending on whether a condition is
 * true or false.
 *
 *
 * if:
 * Executes a block of code when the condition is true.
 *
 * if-else:
 * Executes one block when the condition is true and
 * another block when the condition is false.
 *
 * else-if:
 * Used when we need to check multiple conditions.
 *
 * switch-case:
 * Used to match one value with multiple possible cases.
 */

class control_flow_statement {

    public static void main(String args[]) {

        /*
         * PROGRAM 1: SIMPLE IF
         *
         * Check whether a person is eligible to vote.
         */

        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        }


        /*
         * PROGRAM 2: IF-ELSE
         *
         * Check whether a number is even or odd.
         */

        int num = 10;

        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }


        /*
         * PROGRAM 3: ELSE-IF
         *
         * Check result according to average marks.
         */

        int marks = 75;

        if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }


        /*
         * PROGRAM 4: FIVE SUBJECTS AVERAGE
         *
         * Calculate average of five subjects
         * and display the result.
         */

        int sub1 = 75;
        int sub2 = 80;
        int sub3 = 70;
        int sub4 = 85;
        int sub5 = 90;

        double average = (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0;

        System.out.println("Average = " + average);

        if (average >= 80) {
            System.out.println("Result: A");
        } else if (average >= 70) {
            System.out.println("Result: B");
        } else if (average >= 60) {
            System.out.println("Result: C");
        } else if (average >= 50) {
            System.out.println("Result: D");
        } else {
            System.out.println("Result: Fail");
        }


        /*
         * PROGRAM 5: THREE INPUTS AND GREATEST
         *
         * Find the greatest among three numbers.
         */

        int a = 10;
        int b = 25;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println("Greatest = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Greatest = " + b);
        } else {
            System.out.println("Greatest = " + c);
        }


        /*
         * PROGRAM 6: SWITCH-CASE
         *
         * Simple calculator.
         *
         * Example:
         * java control_flow_statement 5 5 +
         */

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        char opr = args[2].charAt(0);

        switch (opr) {

            case '+':
                System.out.println(x + y);
                break;

            case '-':
                System.out.println(x - y);
                break;

            case '*':
                System.out.println(x * y);
                break;

            case '/':
                System.out.println(x / y);
                break;

            case '%':
                System.out.println(x % y);
                break;

            default:
                System.out.println("Invalid operator");
        }


        /*
         * PROGRAM 7: SWITCH-CASE MATCHING
         *
         * Match a number with a day.
         */

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
```
