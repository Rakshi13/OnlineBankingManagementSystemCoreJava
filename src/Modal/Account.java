package Modal;

public abstract class Account {

    protected int userId;
    protected double balance;

    public Account(int userId){
        this.userId=userId;
        this.balance=0.0;
    }

    protected abstract void calaculateInterest();

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

}
