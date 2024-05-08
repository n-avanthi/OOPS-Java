// Create thread in the two different ways [extending Thread, implementing Runnable] and print a message. 
// Include sleep method in your code.

package CO5.Multithreading;

class MyThread1 extends Thread {
    public void run() {
        try {
            System.out.println("Thread1 is running");
            sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        try {
            System.out.println("Thread2 is running");
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class CreateThread {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start();
        
        MyThread2 t = new MyThread2();
        Thread thread2 = new Thread(t);
        thread2.start();
    }
}
