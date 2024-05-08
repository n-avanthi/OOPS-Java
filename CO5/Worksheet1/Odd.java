// Create a method that takes an integer as a parameter and throws an exception if the number is odd.

package CO5.Worksheet1;

import java.util.*;

public class Odd {
    void EvenOddChecker(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Odd objOdd = new Odd();

        try {
            objOdd.EvenOddChecker(num);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        sc.close();
    }
}
