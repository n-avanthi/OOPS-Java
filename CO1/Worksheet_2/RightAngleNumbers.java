package CO1.Worksheet_2;
// Pattern :
// 1
// 22
// 333
// 4444

import java.util.*;

public class RightAngleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int num1 = sc.nextInt();
        for(int i = 1; i <= num1; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
