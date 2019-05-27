package com.cheer.projectmyself.user.mapper;

import com.cheer.projectmyself.user.model.User;

import java.util.List;

public interface UserMapper {
    void insert(User user);

    void delete(String id);

    void update(User user);

    User getUser(String id);

    List<User> getList();

    int getCountFirst(String id, String password);

    int getCountSecond(String name, String password);
}
