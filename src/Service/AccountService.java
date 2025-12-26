package Service;

import Modal.User;

import java.util.List;

public interface AccountService {

    void createUser(List<User> users);
    void getAllUsers();
    void createAccount(int userId);
    void deposit(int userId,double amount);
    void withdraw(int userId,double amount);
    void getBalance();
}
