package Modal;

public class SavingsAccount extends Account{

    public SavingsAccount(int userId){
        super(userId);
    }

    @Override
    public void calaculateInterest(){
        balance+=balance*0.04;
    }
}
