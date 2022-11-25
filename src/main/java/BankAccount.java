public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 5000) {
            System.out.println("Transaction canceled. Max deposit - 5000 | Your deposit:" + amount);
        } else {
            balance += amount;
            System.out.println("Amount added :" + amount + ". New Balance :" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("There is not enough funds");
        } else {
            balance -= amount;
            System.out.println("Amount deducted :" + amount + ". New Balance :" + balance);
        }
    }

    public void transferFrom(BankAccount receiver, double amount) {
        if (balance < amount) {
            System.out.printf("Transfer canceled. You are trying to transfer %2f units, but only %2f are available.", amount, balance);
        } else {
            balance -= amount;
            receiver.setBalance(receiver.getBalance() + amount);
            System.out.printf("Amount sent : %10.2f New Balance : %10.2f %s", amount, balance,"\n");
        }
    }
}
