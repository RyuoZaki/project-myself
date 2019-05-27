package com.cheer.projectmyself.user.model;

import java.util.StringJoiner;

public class User {
    private String id;
    private String name;
    private String password;
    private Integer member;

    public User(String id, String name, String password, Integer member) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.member = member;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("password='" + password + "'")
                .add("member=" + member)
                .toString();
    }
}
