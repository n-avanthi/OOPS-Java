// Write a program to add, remove, and display elements and their positions in a linked list.

package CO6.Worksheet2;

import java.util.*;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        System.out.println("Elements in the LinkedList:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Position " + i + ": " + linkedList.get(i));
        }

        linkedList.add(2, "Grapes");
        System.out.println("\nAfter adding 'Grapes' at position 2:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Position " + i + ": " + linkedList.get(i));
        }

        linkedList.remove(3);
        System.out.println("\nAfter removing the element at position 3:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Position " + i + ": " + linkedList.get(i));
        }
    }
}
