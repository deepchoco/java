package prac;

public class CheckingAccount extends Account {
    private double overdraftAmount;
    public CheckingAccount(double initBalance, double overdraftAmount) {
        super(initBalance);
        this.overdraftAmount = overdraftAmount;
    }
    @Override
    public void withdraw(double amount) throws OverdraftException{
        if (balance < amount ) {
            double overdraftNeeded = amount - balance;
            if ( overdraftAmount < overdraftNeeded ) {
                 throw new OverdraftException("에러: 대월금 초과", balance, overdraftAmount );
            } else {
                balance = 0.0;
                overdraftAmount -= overdraftNeeded;
                //System.out.println("출금(Overdraft):"+amount);
            }
        } else {
            balance = balance - amount;
            //System.out.println("출금(C):"+amount);
        }
    }
}