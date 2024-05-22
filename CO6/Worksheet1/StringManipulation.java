// Construct a program for the following strings
// S1=hello
// S2=GOODBYE
// S3= spaces
// Output
// Replace l with L in s1
// Convert s1 to uppercase
// Convert s2 to lower case
// Trim s3
// Print s1

package CO6.Worksheet1;

public class StringManipulation {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = " spaces";
        String s1_new = s1.replace('l', 'L');
        System.out.println(s1_new);
        String s2_new = s2.toLowerCase();
        System.out.println(s2_new);
        String s3_new = s3.trim();
        System.out.println(s3_new);
    }
}
