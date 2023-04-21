package com.geekster.User.Management.System.Controller;

import com.geekster.User.Management.System.Model.User;
import com.geekster.User.Management.System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.lang.annotation.Target;
import java.util.List;

@RestController
@RequestMapping("api/v1/app")
public class UserController {

    @Autowired
    UserService userService;

    // http://localhost:8080/api/v1/app/addUser
    @PostMapping(value="/addUser")
    public void addUser(@RequestBody User user){
         userService.addUser(user);
    }

    // http://localhost:8080/api/v1/app/getAllUser
    @GetMapping(value="/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    // http://localhost:8080/api/v1/app/getUser/userId/1
    @GetMapping(value="/getUser/userId/{userId}")
    public User getUserById(@PathVariable int userId){
        return userService.getUserById(userId);
    }


    // http://localhost:8080/api/v1/app/updateUser/userId/2
    @PutMapping(value="/updateUser/userId/{userId}")
    public void updateUserById(@PathVariable int userId, @RequestBody User user){
          userService.updateUserById(userId , user);
    }

    // http://localhost:8080/api/v1/app/deleteUser/userId/1
    @DeleteMapping(value="/deleteUser/userId/{userId}")
    public void deleteUserById(@PathVariable int userId){
         userService.deleteUserById(userId);
    }
}
