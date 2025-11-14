class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println(accountHolder + "'s Balance: " + balance);
    }

    public void transferFunds(BankAccount receiver, double amount) {
        try {
            System.out.println("\nInitiating transfer of " + amount + " to " + receiver.accountHolder);
            try {
                
                if (amount <= 0) {
                    throw new ArithmeticException("Invalid transfer amount.");
                }
                if (amount > balance) {
                    throw new ArithmeticException("Insufficient balance.");
                }
                balance -= amount;
                receiver.balance += amount;
                System.out.println("Transfer successful!");
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Transaction failed: " + e.getMessage());
            } finally {
                System.out.println("Transaction process completed for " + accountHolder);
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ananya", 5000);
        BankAccount acc2 = new BankAccount("Rohan", 3000);
        BankAccount acc3 = null;

        acc1.checkBalance();
        acc2.checkBalance();

        acc1.transferFunds(acc2, 1500);
        acc1.transferFunds(acc3, 500);
        acc1.transferFunds(acc2, 10000);
        acc1.transferFunds(acc2, -200);

        acc1.checkBalance();
        acc2.checkBalance();
    }
}
