package User;

import java.util.*;

public class UserController {
    List<User> userList;

    public UserController(List<User> userList) {
        this.userList = userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public User getUser(int userID) {
        for (User user: userList) {
            if (user.getUserID() == userID) {
                return user;
            }
        }
        return null;
    }
}
