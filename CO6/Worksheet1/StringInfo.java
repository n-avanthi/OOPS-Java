// Construct a program for the following input and output case.
// S1= this is a test. This is a test. This is a test?
// Output
// Length of this string
// The character at position 6
// The substring from 26 to 32
// The index position of first ‘a’
// The index of the beginning of the substring ‘IBM’’

package CO6.Worksheet1;

public class StringInfo {
    public static void main(String[] args) {
        String s1 = "this is a test. This is a test. This is a test?";
        System.out.println("Length: "+ s1.length());
        System.out.println("Character at position 6: "+ s1.charAt(6));
        System.out.println("Substring from 26 to 32: " + s1.substring(26,32));
        System.out.println("index position of first ‘a’: " + s1.indexOf('a') );
        System.out.println("index of the beginning of the substring ‘IBM’:" + s1.indexOf("IBM")  );
    }
}
