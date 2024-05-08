package CO1.Assignment_1;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an integer between 0 and 1000:");
        int num = scanner.nextInt();

        if (num < 0 || num > 1000) {
            System.out.println("Invalid input.");
        } 
        else {
            int sum = 0;
            while (num > 0) {
                sum += num % 10; 
                num /= 10; 
            }
            System.out.println("The sum of all digits in " + num + " is " + sum);
        }
        scanner.close();
    }
}
