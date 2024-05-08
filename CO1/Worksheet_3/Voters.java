// Write a Java program to check whether you are eligible for vote or not? by taking user input as age.

package CO1.Worksheet_3;
import java.util.*;

public class Voters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not eligible");
        }
        sc.close();
    }
}
