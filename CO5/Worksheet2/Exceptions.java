// Using multiple catch statements perform actions for ArrayIndexOutofBoundException, ArithmeticException, 
// NullPointerException, NumberFormatException, Exception.

package CO5.Worksheet2;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 6; //ArrayIndexOutofBoundException

            int a = 5/0; //ArithmeticException

            String b = null;
            System.out.println(b.length()); //NullPointerException

            String c = "abcd";
            int c_num = Integer.parseInt(c); //NumberFormatException
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}
