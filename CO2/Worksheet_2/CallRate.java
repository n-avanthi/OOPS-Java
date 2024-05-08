package Worksheet_2;
import java.util.*;

class Rate{
    double local, ISD, network;

    Rate(){
        local = 0.1;
        ISD = 1.0;
        network = 500;
    } // default constructor

    Rate(double loc, double isd, double net){
        local = loc;
        ISD = isd;
        network = net;
    } // parameterised constructor

    void bill(int call_local, int call_isd) {
        System.out.println("The total amount is given by : "+ ((call_local * local) + (call_isd * ISD) + network));
    }
}

public class CallRate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rate obj1 = new Rate(); //Calling default constructor
        Rate obj2 = new Rate(0.1, 1.0, 500); //Calling parameterised constructor
        System.out.print("Enter the number of local calls and ISD calls made (defualt constructor) : ");
        obj1.bill(sc.nextInt(), sc.nextInt());
        System.out.print("Enter the number of local calls and ISD calls made (parameterised constructor) : ");
        obj2.bill(sc.nextInt(), sc.nextInt());
        sc.close();
    }
}