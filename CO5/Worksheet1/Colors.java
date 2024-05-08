// Define a class which contains method “DisplayColor” which takes one character as argument. Raise an exception, 
// if the character is not an alphabet. If the alphabet is a color of the rainbow, display the color name. 
// If it is any other alphabet, report an exception.

package CO5.Worksheet1;

import java.util.*;

class ColorFinder {
    void DisplayColour(char alphabet) throws Exception{
        if(Character.isLetter(alphabet) == false) {
            throw new Exception("Not an alphabet");
        }
        
        switch (Character.toLowerCase(alphabet)) {
            case 'v':
                System.out.println("Voilet");
                break;
            case 'i':
                System.out.println("Indigo");
                break;
            case 'b':
                System.out.println("Blue");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'y':
                System.out.println("Yellow");
                break;
            case 'o':
                System.out.println("Orange");
                break;
            case 'r':
                System.out.println("Red");
                break;
            default:
                throw new Exception("Not part of Rainbow");
        }
    }
}

public class Colors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char alphabet = sc.next().charAt(0);
        ColorFinder color = new ColorFinder();
        
        try {
            color.DisplayColour(alphabet);
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        sc.close();
    }
}
