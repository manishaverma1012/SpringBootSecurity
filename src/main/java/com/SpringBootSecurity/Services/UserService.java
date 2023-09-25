package com.SpringBootSecurity.Services;

import com.SpringBootSecurity.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> userlist=new ArrayList<>();
    public UserService()
    {
        userlist.add(new User("Manisha", "34543rbjfd","32324dffd@gmail.com"));
        userlist.add(new User("Aman","dfreu6328432","2843heudfjds@gmail.com"));

    }
    public List<User> getAllUser()
    {
        return this.userlist;
    }
    public User getUserByUsername(String username)
    {
        return this.userlist.stream().filter((User)->(User.getUsername().equals(username))).findAny().orElse(null);
    }
    public User addUser(User user)
    {
        this.userlist.add(user);
        return user;

    }

}
