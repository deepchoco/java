package prac;

public abstract class Account {
    protected double balance;
    public Account(double initBalance) {
    balance = initBalance;
    }
    public double getBalance() {
           return balance;
    }
    public abstract void withdraw(double amount) throws Exception;
}
