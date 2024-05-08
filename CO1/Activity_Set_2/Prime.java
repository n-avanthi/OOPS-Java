// Print the first 50 prime numbers, 10 in a row

package CO1.Activity_Set_2;

public class Prime {
    public static void main(String args[]) {

        int count = 0;
        int num = 2;

        while(count<50){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } 
            }      
            if(isPrime==true){
                System.out.print(num + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            num++;
        }
    }
}