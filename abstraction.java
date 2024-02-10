
// abstraction - a technique of sencitive data hide.      
import java.util.Scanner;

class abstraction {
    public static void main(String args[]) {
        System.out.println("1. For Show balance");
        System.out.println("2. For Withdraw");
        System.out.println("3. For Deposit");
        System.out.println("chose your choice 1 2 3");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        customers obj = new customers();

        if (choice == 1) {
            obj.showbalance();
        } else if (choice == 2) {
            obj.withdraw();
        } else if (choice == 3) {
            obj.deposit();
        }

    }
}

abstract class Bank {
    public String name = "yes bank";
    public String ifsc = "pytm012345";

    public void bankdetials() {
        System.out.println("bank name: " + name + " and ifsc code is " + ifsc);
    }

    abstract void showbalance();

    abstract void withdraw();

    abstract void deposit();
}

class customers extends Bank {
    private int pass = 1234;
    private double total = 500;

    void showbalance() {
        System.out.println("enter password / pin ");
        Scanner s = new Scanner(System.in);
        int pass = s.nextInt();
        if (this.pass == pass) {
            System.out.println("Balance is : " + total);
        } else {
            System.out.println("Enter correctro pin/pass");
        }
    }

    void withdraw() {
        System.out.println("enter password / pin ");
        Scanner s = new Scanner(System.in);
        int pass = s.nextInt();
        if (this.pass == pass) {
            System.out.println("Enter amount for withdraw");
            int amount = s.nextInt();
            total = total - amount;
            System.out.println("Remaining Balance is : " + total);
        } else {
            System.out.println("Enter correctro pin/pass");
        }
    }

    // deposit ही तो हो रहा है पासवर्ड क्यों 🤔 पैसा आ ही तो रहा है आने दो किसी का
    // भी 😂😁
    void deposit() {
        System.out.println("Enter amount for Deposit");
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();
        total = total + amount;
        System.out.println("Remaining Balance is : " + total);
    }
}