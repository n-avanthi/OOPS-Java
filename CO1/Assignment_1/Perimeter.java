package CO1.Assignment_1;
import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        float length = scanner.nextFloat();

        System.out.println("Enter the width of the rectangle:");
        float width = scanner.nextFloat();

        float perimeter = 2 * (length + width);

        System.out.println("The perimeter of the rectangle is: " + perimeter);

        scanner.close();
    }
}
