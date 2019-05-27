package com.cheer.projectmyself.user.web.controller;

import com.cheer.projectmyself.user.model.User;
import com.cheer.projectmyself.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/insertUser")
    public void insert(User user){
        userService.insert(user);
    }

    @GetMapping("/deleteUser")
    public void delete(String id){
        userService.delete(id);
    }

    @GetMapping("/updateUser")
    public void update(User user){
        userService.update(user);
    }

    @GetMapping("/getUser")
    public User getUser(String id){
        return userService.getUser(id);
    }

    @GetMapping("/getList")
    public List<User> getList(){
        return userService.getList();
    }

    @PostMapping("/login")
    public boolean login(@RequestParam String idName, @RequestParam String password){
        if (userService.getCountFirst(idName, password)){
            return true;
        }else{
            return userService.getCountSecond(idName, password);
        }
    }
}
