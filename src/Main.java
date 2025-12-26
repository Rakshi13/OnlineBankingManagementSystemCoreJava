import Modal.Account;
import Modal.User;
import Service.AccountService;
import Service.Impl.AccountServiceImpl;

import java.awt.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AccountService accountService = new AccountServiceImpl();

        //creating a list of users . this is not optimal approach .
//        accountService.createUser(1,"Rakshith.G");
//        accountService.createUser(2,"Ramu");
//        accountService.createUser(3,"Shashank.S");

        //instead create a list

        List<User> list = List.of(
                new User(1, "Rakshith.G"),
                new User(2, "Ramu"),
                new User(3, "Shashank.S")
        );

        accountService.createUser(list);

        System.out.println(list.size()+" Users added successfully");

        System.out.println();

        //get all users

        System.out.println("List of USERS are :-");
        System.out.println("----------------------------------");
        accountService.getAllUsers();
        System.out.println();

        System.out.println("CREATE ACCOUNT FOR SPECIFIC USER:");
        System.out.println("----------------------------------");

        //create account
        accountService.createAccount(1);

        System.out.println();

        System.out.println("Deposit amount FOR SPECIFIC USER:");
        System.out.println("----------------------------------");
        accountService.deposit(1,30000);
        System.out.println();

        System.out.println("Withdraw amount FOR SPECIFIC USER:");
        System.out.println("----------------------------------");
        accountService.withdraw(1,20000);
        System.out.println();

        System.out.println("check bank balance:");
        System.out.println("----------------------------------");
        accountService.getBalance();
        System.out.println();

    }
}