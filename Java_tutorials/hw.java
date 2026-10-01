import java.util.Scanner;
import java.io.*;

class InputOutputPrograms {

    // Scanner Program 1
    static void scanner1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Scanner Program 2
    static void scanner2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
    }

    // Scanner Program 3
    static void scanner3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        System.out.println("Area = " + (length * breadth));
    }

    // BufferedReader Program 1
    static void bufferReader1() throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // BufferedReader Program 2
    static void bufferReader2() throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Sum = " + (a + b));
    }

    // BufferedReader Program 3
    static void bufferReader3() throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter length: ");
        double length = Double.parseDouble(br.readLine());

        System.out.print("Enter breadth: ");
        double breadth = Double.parseDouble(br.readLine());

        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) throws IOException {

        System.out.println("===== SCANNER 1 =====");
        scanner1();

        System.out.println("\n===== SCANNER 2 =====");
        scanner2();

        System.out.println("\n===== SCANNER 3 =====");
        scanner3();

        System.out.println("\n===== BUFFEREDREADER 1 =====");
        bufferReader1();

        System.out.println("\n===== BUFFEREDREADER 2 =====");
        bufferReader2();

        System.out.println("\n===== BUFFEREDREADER 3 =====");
        bufferReader3();
    }
}