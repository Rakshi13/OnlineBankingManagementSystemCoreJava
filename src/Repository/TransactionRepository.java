package Repository;

import Modal.Transaction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TransactionRepository {

    List<Transaction> transactionList =new ArrayList<>();

    public void save(Transaction transaction){
        transactionList.add(transaction);
    }

    public Collection<Transaction> findAll(){
        return transactionList;
    }
}
