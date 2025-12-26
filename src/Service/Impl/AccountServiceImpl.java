package Service.Impl;

import Modal.SavingsAccount;
import Modal.Transaction;
import Modal.TransactionType;
import Modal.User;
import Repository.TransactionRepository;
import Repository.UserRepository;
import Service.AccountService;

import java.awt.*;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private UserRepository userRepository=new UserRepository();
    private TransactionRepository transactionRepository=new TransactionRepository();
    private SavingsAccount savingsAccount;

//    @Override
//    public void createUser(int id,String name){
//        userRepository.save(new User(id,name));
//        System.out.println("USER ADDED SUCCESSFULLY");
//    }

    @Override
    public void createUser(List<User> users){
//        for(User user:users){
//            userRepository.save(new User(user.getId(),user.getName()));
//        }

        //method reference
        users.forEach(userRepository::save);
    }

    @Override
    public void getAllUsers(){
        userRepository.findAll().forEach(user -> {
            System.out.println("userid : "+user.getId()+" | "+"Username : "+user.getName());
        });
    }

    @Override
    public void createAccount(int userId){
        savingsAccount=new SavingsAccount(userId);
        System.out.println("User account is created");
    }

    @Override
    public void deposit(int userId,double amount){
        double totalBalance=savingsAccount.getBalance();
        totalBalance+=amount;
        savingsAccount.setBalance(totalBalance);
        transactionRepository.save(new Transaction(userId,amount, TransactionType.CREDIT));
        System.out.println("Balance Amount is successfully despoited:"+amount);
    }

    @Override
    public void withdraw(int userId,double amount){
        double totalBalance=savingsAccount.getBalance();
        totalBalance-=amount;
        savingsAccount.setBalance(totalBalance);
        transactionRepository.save(new Transaction(userId,amount, TransactionType.DEBIT));
        System.out.println("Withdrawal Amount is :"+amount);
    }

    @Override
    public void getBalance(){
        System.out.println("Total Balance is : "+savingsAccount.getBalance());
    }

}
