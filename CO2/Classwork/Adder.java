// Using method overloading add - two int values, add - two int and float values, add- three int values.

package Classwork;

class Addition {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public float add(int num1, float num2) {
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

public class Adder {
    public static void main(String[] args) {
        Addition obj1 = new Addition();

        int twoIntegerAdd = obj1.add(5, 4);
        System.out.println("Sum of two integers is given by: " + twoIntegerAdd);
        
        // Calculate area of a square
        float floatIntegerAdd = obj1.add(5, (float)6.0);
        System.out.println("Sum of integer and float is given by: " + floatIntegerAdd);
        
        // Calculate area of a circle
        double threeIntegerAdd = obj1.add(3, 4, 5);
        System.out.println("Sum of three integers is given by: " + threeIntegerAdd);
    }
}
