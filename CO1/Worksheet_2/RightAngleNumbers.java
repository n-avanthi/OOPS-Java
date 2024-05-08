// Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a 
// number in a row. The pattern is as follows
// 1
// 22
// 333
// 4444

package CO1.Worksheet_2;
import java.util.*;

public class RightAngleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num1 = sc.nextInt();
        for(int i = 1; i <= num1; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
