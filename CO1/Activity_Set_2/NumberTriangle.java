package CO1.Activity_Set_2;
// Pattern :
//     1
//    212
//   32123
//  4321234
// 543212345

import java.util.*;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++) {
            for(int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = i; k >= 1;  k--) {
                System.out.print(k);
            }
            for(int n = 2; n <= i; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
        sc.close();
    }
}