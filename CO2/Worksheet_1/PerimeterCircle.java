package Worksheet_1;
import java.util.*;

class perimeter {
    double circle(double radius) {
        double result;
        result = 2 * radius * Math.PI;
        return result;
    }
}

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perimeter ob1 = new perimeter();
        double radius = sc.nextDouble();
        double result = ob1.circle(radius);
        System.out.println("Perimeter calculated is : " + result);
        sc.close();
    }
    
}

// private type not visible outside that class
// public type accessible across diff classes
// if method type not specified - default public type