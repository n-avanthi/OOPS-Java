// Write a program in Java to display the multiplication table of a given integer.

package CO1.Worksheet_4;
import java.util.*;

public class MultTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
        sc.close();
    }
}