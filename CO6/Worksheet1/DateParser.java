// Print birth date, year, month.
// Input: 26/2/1980
// Output:
// 26
// 2
// 1980

package CO6.Worksheet1;

public class DateParser {
    public static void main(String[] args) {
        String date = "26/2/1980";
        String[] parts = date.split("/");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];
        System.out.println(day+month+year);
    }
}
