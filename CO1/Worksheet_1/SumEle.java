// Write a program to initialise an array and print the sum of the array elements

package CO1.Worksheet_1;
public class SumEle {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
