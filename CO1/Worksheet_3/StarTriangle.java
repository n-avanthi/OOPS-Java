package CO1.Worksheet_3;
// Pattern :
// * * * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

import java.util.*;
public class StarTriangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();

        for(int i =1;i<=rows-1;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=rows-i-1;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
            sc.close();
        }
    }
}
