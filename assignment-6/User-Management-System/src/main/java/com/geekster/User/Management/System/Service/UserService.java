package com.geekster.User.Management.System.Service;

import com.geekster.User.Management.System.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {

    private static final List<User> usersList = new ArrayList<>();
    private static int countId = 0;

    static{
        usersList.add(new User(++countId, "Ankush" , "@ankushsa", "Agra", "9870811484"));
        usersList.add(new User(++countId, "Deepak", "@deepakdhackrey", "Agra", "9670954570"));
        usersList.add(new User(++countId, "Pavan", "@pavansharma" , "Mathura", "8058585810"));
        usersList.add(new User(++countId, "Ekansh", "@akshsharm", "Mumbai", "6086960123"));
    }

    public void addUser(User user) {
        usersList.add(user);
    }

    public List<User> getAllUser() {
        return usersList;
    }

    public User getUserById(int userId) {
        Predicate<? super User> predicate = user -> user.getUserId() == userId;
        User user = usersList.stream().filter(predicate).findFirst().get();
        return user;
    }

    public void updateUserById(int userId, User newuser) {

        User user = getUserById(userId);

        user.setUserId(newuser.getUserId());
        user.setName(newuser.getName());
        user.setUserName(newuser.getUserName());
        user.setAddress(newuser.getAddress());
        user.setPhoneNumber(newuser.getPhoneNumber());

    }

    public void deleteUserById(int userId) {
        Predicate<? super User> predicate = user -> user.getUserId() == userId;
        usersList.removeIf(predicate);
    }
}
