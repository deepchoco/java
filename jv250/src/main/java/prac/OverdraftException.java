package prac;

public class OverdraftException extends Exception {
    private double overdraftAvail;
    public OverdraftException(String msg, double overdraftAvail, double overdraftAmount){
           super(msg);
           this.overdraftAvail = overdraftAvail;
    }
    @Override
    public String getMessage(){
           return "사용 가능한 대월액은 "+overdraftAvail+"원 입니다.";
    }
}