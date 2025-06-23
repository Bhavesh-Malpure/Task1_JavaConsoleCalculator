import java.util.Scanner;

class Calculator {
    public void Addition() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        a = sc.nextInt();
        System.out.print("Enter Second number: ");
        b = sc.nextInt();
        int result = a + b;
        System.out.println("Addition Result: " + result);
    }

    public void Subtraction() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        a = sc.nextInt();
        System.out.print("Enter Second number: ");
        b = sc.nextInt();
        int result = a - b;
        System.out.println("Subtraction Result: " + result);
    }

    public void Multiplication() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        a = sc.nextInt();
        System.out.print("Enter Second number: ");
        b = sc.nextInt();
        int result = a * b;
        System.out.println("Multiplication Result: " + result);
    }

    public void Division() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        a = sc.nextInt();
        System.out.print("Enter Second number: ");
        b = sc.nextInt();

        if (b == 0) {
            System.out.println("Error: Cannot divide a number by zero.");
        } else {
            int result = a / b;
            System.out.println("Division Result: " + result);
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Scanner s = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n***** Menu *****");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    c1.Addition();
                    break;
                case 2:
                    c1.Subtraction();
                    break;
                case 3:
                    c1.Multiplication();
                    break;
                case 4:
                    c1.Division();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
