// incapsulation binding data members and member methods  

import java.util.Scanner;

class Customer {
    String Name;
    private int Balance = 5000;
    private int setedpass = 123;

    void showbalance(int pass) {
        if (setedpass == pass) {
            System.out.println("Total bal. is "+Balance);
        } else {
            System.out.println("enter valid password");
        }
    }

    void deposit(int amount) {
        Balance = Balance + amount;
        System.out.println("Deposit successfull your total balance is " + Balance);
    }

    void withdraw(int amount, int pass) {
        if (setedpass == pass) {
            Balance = Balance - amount;
            System.out.println("Withdrawl successfull remaining balance is " + Balance);
        } else {
            System.out.println("enter valid pass/pin");
        }
    }
}

class encapsulation {
    public static void main(String args[]) {
        System.out.println("1. For Show balance");
        System.out.println("2. For Withdraw");
        System.out.println("3. For Deposit");
        System.out.println("chose your choice 1 2 3");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        int amount, pass;
        Customer obj = new Customer();

        switch (choice) {
            case 1:
                System.out.println("Enter Pass/Pin");
                pass = s.nextInt();
                obj.showbalance(pass);
                break;
            case 2:
                System.out.println("Enter Pass/Pin");
                pass = s.nextInt();
                System.out.println("Enter amount for withdraw");
                amount = s.nextInt();
                obj.withdraw(amount, pass);
                break;
            case 3:
                System.out.println("Enter amoutn to deposit");
                amount = s.nextInt();
                obj.deposit(amount);
            default:
                break;
        }
    }
}