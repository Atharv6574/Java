import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;
        System.out.println("\nArithmetic Operations:");
        System.out.println("Sum (num1 + num2): " + sum);
        System.out.println("Difference (num1 - num2): " + difference);
        System.out.println("Product (num1 * num2): " + product);
        System.out.println("Quotient (num1 / num2): " + quotient);
        System.out.println("Remainder (num1 % num2): " + remainder);
        scanner.close();
    }
}
