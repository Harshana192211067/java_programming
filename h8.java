import java.util.Scanner;

class Bank_Account {
    // Data members
    String name, type;
    int acc_num;
    double bal;

    // Parameterized constructor
    Bank_Account(String n, int a, String t, double b) {
        name = n;
        acc_num = a;
        type = t;
        bal = b;
    }

    // Method to deposit money
    void deposit(double d) {
        if (d > 0) {
            bal += d;
            System.out.println("Deposited: Rs." + d);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Method to withdraw money
    void withdraw(double w) {
        if (w > 0 && w <= bal) {
            bal -= w;
            System.out.println("Withdrew: Rs." + w);
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    // Method to display account details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acc_num);
        System.out.println("Account Type: " + type);
        System.out.println("Balance: Rs." + bal);
    }
}

public class h8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading account details from user
        System.out.print("Enter the name: ");
        String n = input.nextLine();
        
        System.out.print("Enter Account number: ");
        int a = input.nextInt();
        
        System.out.print("Enter the type of account (S for Savings, C for Current): ");
        String t = input.next();
        
        System.out.print("Enter the balance amount: Rs.");
        double b = input.nextDouble();
        
        // Creating a Bank_Account object
        Bank_Account bank = new Bank_Account(n, a, t, b);
        
        // Display account details
        bank.display();
        
        // Example of deposit and withdraw
        System.out.print("Enter amount to deposit: Rs.");
        double depositAmount = input.nextDouble();
        bank.deposit(depositAmount);
        
        System.out.print("Enter amount to withdraw: Rs.");
        double withdrawAmount = input.nextDouble();
        bank.withdraw(withdrawAmount);
        
        // Display updated account details
        bank.display();
    }
}
