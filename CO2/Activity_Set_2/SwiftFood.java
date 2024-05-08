// Create a new class Restaurant in the Java project SwiftFood
// displayRestaurantDetails() - Display the details of the restaurant (the values of the member variables)
// Create an object of the Restaurant class, initialize the instance variables, and invoke the displayRestaurantDetails() method in the main() method of the Tester class.

import java.util.*;

class Restaurant {
    String restaurantName;  
    String restaurantAddress;
    float rating;
    long restaurantContact;

    Restaurant(String resName, String resAddress, float resRating, long resContact) {
        this.restaurantName = resName;
        this.restaurantContact = resContact;
        this.restaurantAddress = resAddress;
        this.rating = resRating;
    }

    void displayRestaurantDetails() {
        System.out.println("Restaurant Details");
        System.out.println("******************");
        System.out.println("Restaurant Name : " + this.restaurantName);
        System.out.println("Rating : " + this.rating);
        System.out.println("Restaurant Contact : " + this.restaurantContact);
        System.out.println("Restaurant Address : " + this.restaurantAddress);
    }
}

public class SwiftFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Restaurant Name : ");
        String restaurantName = sc.nextLine();

        System.out.print("Enter Restaurant Address : ");
        String restaurantAddress = sc.nextLine();

        System.out.print("Enter Restaurant Contact : ");
        long restaurantContact = sc.nextLong();

        System.out.print("Enter Restaurant Rating : ");
        float rating = sc.nextFloat();

        Restaurant obj1 = new Restaurant(restaurantName, restaurantAddress, rating, restaurantContact);
        obj1.displayRestaurantDetails();

        sc.close();
    }
}
