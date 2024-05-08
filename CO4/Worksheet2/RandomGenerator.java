// Program to print random numbers in a given range

package CO4.Worksheet2;

import java.util.Scanner;
import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the minimum value of the range : ");
        int minRange = sc.nextInt();
        System.out.print("Enter the maximum value of the range : ");
        int maxRange = sc.nextInt();

        Random randomGen = new Random();
        int randomNum = randomGen.nextInt(maxRange - minRange + 1) + minRange;
        System.out.println("Random number generated : " + randomNum); 
        sc.close();
    }
}
