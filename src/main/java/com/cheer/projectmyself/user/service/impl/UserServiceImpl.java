package com.cheer.projectmyself.user.service.impl;

import com.cheer.projectmyself.user.mapper.UserMapper;
import com.cheer.projectmyself.user.model.User;
import com.cheer.projectmyself.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void delete(String id) {
        userMapper.delete(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User getUser(String id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<User> getList() {
        return userMapper.getList();
    }

    @Override
    public boolean getCountFirst(String id, String password) {
        if (userMapper.getCountFirst(id,password) == 1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean getCountSecond(String name, String password) {
        if (userMapper.getCountFirst(name,password) == 1){
            return true;
        }else{
            return false;
        }
    }
}
