//Create an abstract class "Parent" with a method "message". It has two subclasses each having a method with 
// the same name "message" that prints "This is first subclass" and "This is second subclass" respectively. 
// Call the methods "message" by creating an object for each subclass.

package CO3.Worksheet4;

abstract class Parent {
    abstract void message();
}

class Child1 extends Parent {
    void message() {
        System.out.println("This is the first subclass");
    }
}

class Child2 extends Parent {
    void message() {
        System.out.println("This is the second subclass");
    }
}

public class MessageAbstraction {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        obj1.message();
        obj2.message();
    }
}
