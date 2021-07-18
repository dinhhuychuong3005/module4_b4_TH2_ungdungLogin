package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User user1 = new User("john", "123456", "John", "john@codegym.vn", 10);
        User user2 = new User("bill", "123456", "Bill", "bill@codegym.vn", 15);
        User user3 = new User("mike", "123456", "Mike", "mike@codegym.vn", 16);
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
