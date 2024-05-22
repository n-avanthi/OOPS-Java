// Write a program to iterate a linked list in reverse order.

package CO6.Worksheet2;

import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator itr = list.iterator();
        for(int i=list.size()-1; i >= 0; i--){
            System.out.println(itr.next());
        }
    }
}
