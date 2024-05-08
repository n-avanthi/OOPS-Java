// Write a program to input and print the integer value


package CO1.Worksheet_1;
import java.util.*;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number is: " + num);
        sc.close();
    }
}
