package Repository;

import Modal.User;

import java.util.Collection;
import java.util.HashMap;

public class UserRepository {

    HashMap<Integer, User>users=new HashMap<>();

    public void save(User user){
        users.put(user.getId(),user);
    }

    public Collection<User> findAll(){
        return users.values();
    }


}
