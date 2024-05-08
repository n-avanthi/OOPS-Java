package Worksheet_1;
import java.util.*;

public class RetailStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bill amount : ");
        double billAmount = sc.nextDouble();
        Bill objBill = new Bill(billAmount);
        objBill.calculatePercentage();
        System.out.println("The total bill amount is : "+ objBill.billAmount + " and the discounted amount is : "+ objBill.discountAmount);
        sc.close();
    }
}

class Bill {
    double billAmount;
    double discountAmount;
    double DISCOUNT_1000 = 0.05;
    double DISCOUNT_500_1000 = 0.02;
    double DISCOUNT_500 = 0.01;

    Bill(double amount){
        this.billAmount = amount;
        this.discountAmount = 0;
    }

    public void calculatePercentage(){
        if(billAmount >= 1000) {
            this.discountAmount = billAmount - (DISCOUNT_1000 * billAmount);
        }
        else if(billAmount >= 500 & billAmount < 1000) {
            this.discountAmount = billAmount - (DISCOUNT_500_1000 * billAmount);
        }
        else {
            this.discountAmount = billAmount - (DISCOUNT_500 * billAmount);
        }
        return;
    }
}

//this keyword points to class parameters