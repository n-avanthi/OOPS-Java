package CO1.Worksheet_4;
import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix :");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix :");
        int columns = sc.nextInt();

        int[][] matrix = new int [rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.println("Enter the " + (i+1) + " , " + (j+1) + " th element :");
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int [columns][rows];
        for(int i = 0; i < columns; i++) {
            for(int j = 0; j < rows; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Original Matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
