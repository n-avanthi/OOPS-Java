package CO1.Worksheet_2;
import java.util.*;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("First 10 numbers are: ");
        for(int i = num; i < num + 10; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
