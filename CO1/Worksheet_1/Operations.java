// Write a program to implement arithmetic operations on two int values (addition, subtraction, multiplication, 
// division)

package CO1.Worksheet_1;
import java.util.*;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        float num1 = scanner.nextFloat();

        System.out.println("Enter the second number:");
        float num2 = scanner.nextFloat();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        float result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
        }
        scanner.close();
    }
}
