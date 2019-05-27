package com.cheer.projectmyself.user.service;

import com.cheer.projectmyself.user.model.User;

import java.util.List;

public interface UserService {
    void insert(User user);

    void delete(String id);

    void update(User user);

    User getUser(String id);

    List<User> getList();

    boolean getCountFirst(String id, String password);

    boolean getCountSecond(String name, String password);
}
