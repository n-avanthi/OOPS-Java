// Create an abstract class Bank with an abstract method getBalance. $100, $150 and $200 are deposited in banks 
// A, B and C respectively. BankA, BankB and BankC are subclasses of class Bank, each having a method named 
// getBalance. Call this method by creating an object of each of the three classes.

package CO3.Worksheet4;

abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    private int balance = 100;
    void getBalance() {
        System.out.println("Balance of Bank A is given by : "+ balance);
    }
}

class BankB extends Bank {
    private int balance = 150;
    void getBalance() {
        System.out.println("Balance of Bank B is given by : "+ balance);
    }
}

class BankC extends Bank {
    private int balance = 200;
    void getBalance() {
        System.out.println("Balance of Bank C is given by : "+ balance);
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        BankA obj1 = new BankA();
        obj1.getBalance();

        BankB obj2 = new BankB();
        obj2.getBalance();
        
        BankC obj3 = new BankC();
        obj3.getBalance();
    }
}
