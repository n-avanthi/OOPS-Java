package Worksheet_1;
import java.util.*;

public class VolumeRect {
    public static void main(String[] args) {
        vol ob1 = new vol();
        ob1.assign();
        int result = ob1.volume();
        System.out.println("Volume calculated is : " + result);
    }
    
}

class vol {
    Scanner sc = new Scanner(System.in);
    int l, b, h;
    
    void assign() {
        System.out.print("Enter length :");
        l = sc.nextInt();
        System.out.print("Enter breadth :");
        b = sc.nextInt();
        System.out.print("Enter height :");
        h = sc.nextInt();
    }

    int volume() {
        int vol;
        vol = l* b * h;
        return vol;
    }
}