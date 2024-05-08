// Develop a Java code to print the name of the running thread

package CO5.Multithreading;

public class ThreadName {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println("Name of currently running thread is: " + t1.getName());
    }
}
