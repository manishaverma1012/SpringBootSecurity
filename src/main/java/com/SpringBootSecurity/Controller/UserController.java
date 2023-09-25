package com.SpringBootSecurity.Controller;

import com.SpringBootSecurity.Model.User;
import com.SpringBootSecurity.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userservice;

    //all user
    @GetMapping("/getalluser")
    public List<User> GetAllUser()
    {
        return this.userservice.getAllUser();

    }
    @GetMapping("/{username}")
    public User GetSingleUser(@PathVariable String username)
    {
        return this.userservice.getUserByUsername(username);
    }
    @PostMapping("/adduser")
    public User AddnewUser(@RequestBody User user)
    {
        return this.userservice.addUser(user);

    }
}
