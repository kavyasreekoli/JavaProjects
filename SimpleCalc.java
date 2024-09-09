import java.util.Scanner;

public class SimpleCalc {

    // Method to add two numbers
    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public static long subtract(long num1, long num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public static long multiply(long num1, long num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public static long divide(long num1, long num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
        return num1 / num2;
    }
     // Method to find modulus of two numbers
     public static long modulus(long num1, long num2) {
        return num1 % num2;
    }

    

    public static void main(String[] args) {
        long num1;
        long num2;
        char operator;
        // User input
        try (Scanner scanner = new Scanner(System.in)) {
            // User input
            System.out.println("Enter first number: ");
            num1 = scanner.nextLong();
            System.out.println("Enter second number: ");
            num2 = scanner.nextLong();
            System.out.println("Choose an operation: +, -, *, /, ^, %");
            operator = scanner.next().charAt(0);
        }
        long result;

        // Switch case to handle operation choice
        switch (operator) {
            case '+' -> result = add(num1, num2);
            case '-' -> result = subtract(num1, num2);
            case '*' -> result = multiply(num1, num2);
            case '/' -> result = divide(num1, num2);
            case '%' -> result = modulus(num1, num2);
           // case '^' -> result = power(num1, num2);
            default -> {
                System.out.println("Invalid operator!");
                return;
            }
        }

        // Output the result
        System.out.println("Result: " + result);
        //scanner.close();
    }
}
