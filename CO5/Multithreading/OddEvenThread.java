//  Create two threads and print even numbers with one thread and odd numbers with another thread.

package CO5.Multithreading;

class OddThread extends Thread {
    public void run() {
        for (int i=1; i<=10; i+=2) {
            System.out.println(i);
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i=0; i<=10; i+=2) {
            System.out.println(i);
        }
    }
}

public class OddEvenThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        oddThread.start();

        try {
            oddThread.join();
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        
        EvenThread evenThread = new EvenThread();
        evenThread.start();
    }
}
