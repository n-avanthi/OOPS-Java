// create a class called Car with instance variables company_name, model_name, year, and mileage. Use assign() 
// for assigning the variable values and display() for displaying all the values of instance variables.

package Assignment_2;

import java.util.*;

class Car {
    String company_name;
    String model_name;
    int year;
    double mileage;

    public void assign(String company_name, String mod_name, int car_year, double car_mileage) {
        this.company_name = company_name;
        this.model_name = mod_name;
        this.year = car_year;
        this.mileage = car_mileage;
    }

    public void display() {
        System.out.println("Company: "+ this.company_name + " Model Name: "+ this.model_name + " Year: "+ this.year + " Mileage: "+ this.mileage);
    }
}

public class CarDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String comp_name = sc.nextLine();
        System.out.print("Enter year: ");
        int car_year = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter model name: ");
        String mod_name = sc.nextLine();
        System.out.print("Enter mileage: ");
        double car_mileage = sc.nextDouble();
        Car obj1 = new Car();
        obj1.assign(comp_name, mod_name, car_year, car_mileage);
        obj1.display();
        sc.close();
    }
}
