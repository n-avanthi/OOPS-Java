package CO1.Activity_Set_2;
import java.util.*;

public class InsertEleArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the "+ i +"th element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the new element to be inserted : ");
        int ele = sc.nextInt();

        System.out.print("Enter position of new element : ");
        int pos = sc.nextInt();

        if(pos < 0 || pos > size) {
            System.out.println("Position invalid");
        }
        else {
            int newArr[] = new int [size+1];
            for(int i = 0; i < pos-1; i++) {
                newArr[i] = arr[i];
            }
            newArr[pos-1] = ele;
            for(int i = pos; i < size+1; i++) {
                newArr[i] = arr[i-1];
            }

            System.out.println("Array elements : ");
            for(int i = 0; i < size+1; i++) {
                System.out.println(newArr[i]);
            }
        }
        sc.close();
    }
}