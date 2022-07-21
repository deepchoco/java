package prac;

public class SavingAccount extends Account {
    private double interestRate;
    public SavingAccount(double initBalance, double interestRate) {
           super(initBalance);
           this.interestRate = interestRate;
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
           if(balance - amount < 0){
                   throw new InsufficientBalanceException("에러: 잔고부족", balance);
           }else{
                   balance -= amount;
           }
    }
}
