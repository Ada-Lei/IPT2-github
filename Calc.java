import java.util.Scanner;
 
public class Calc {

    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

        // Method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }

    // Method for modulus
    public static int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Division by zero in modulus");
            return 0;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
 
        double result = 0; // For storing the result
 
        // Switch case for selecting operation
        switch (op) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            case '%':
                result = modulus(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                return; // Exit if invalid operator
        }
 
        // Print the result
        System.out.println("The result is: " + result);
    }
}