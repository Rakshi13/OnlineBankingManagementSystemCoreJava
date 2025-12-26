package Modal;

public class Transaction {
    private int userId;
    private double amount;
    private TransactionType type;

    public Transaction(int userId,double amount,TransactionType type){
        this.userId=userId;
        this.amount=amount;
        this.type=type;
    }

    public double getAmount(){
        return amount;
    }

    public TransactionType getType(){
        return type;
    }
}
