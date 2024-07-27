class Customer {
    private int accountNo;
    private String accName;
    private double balance;
    public Customer(int accountNo, String accName, double balance) {
        this.accountNo = accountNo;
        this.accName = accName;
        this.balance = balance;
    }
    public synchronized void deposit(double amount) {
        System.out.println("Depositing " + amount + " to account " + accountNo);
        balance += amount;
        System.out.println("New balance after deposit: " + balance);
        notify(); // Notify waiting threads that balance has been updated
    }
    public synchronized void withdraw(double amount) {
        System.out.println("Requesting to withdraw " + amount + " from account " + accountNo);
        while (balance < amount) {
            System.out.println("Insufficient balance, waiting for deposit...");
            try {
                wait(); // Wait until a deposit is made
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdraw operation success, balance amount: " + balance);
    }
    public double getBalance() {
        return balance;
    }
}
public class h10 {
    public static void main(String[] args) {
        Customer customer = new Customer(12345, "John Doe", 10000);

        Thread withdrawThread = new Thread(() -> {
            customer.withdraw(12000);
        });

        Thread depositThread = new Thread(() -> {
            try {
                // Simulate delay in deposit
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            customer.deposit(3000);
        });
        withdrawThread.start();
        depositThread.start();

        try {
            withdrawThread.join();
            depositThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
