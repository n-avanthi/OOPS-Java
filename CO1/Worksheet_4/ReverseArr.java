package CO1.Worksheet_4;
import java.util.*;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Original Array: ");
        int size = sc.nextInt();
        int array[] = new int [size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int start = 0;
        int end = size-1;
        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reverse Array");
        for(int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}
