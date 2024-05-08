// Write a program to print Good morning and Welcome continuously on the screen in Java using threads.

package CO5.Multithreading;

class Message1 extends Thread {
    public void run() {
        while(true) {
            System.out.println("Good morning");
        }
    }
}

class Message2 extends Thread {
    public void run() {
        while(true) {
            System.out.println("Welcome");
            try {
                sleep(2000);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadMessage {
    public static void main(String[] args) {
        Message1 thread1 = new Message1();
        Message2 thread2 = new Message2();

        thread1.start();
        thread2.start();
    }
}
