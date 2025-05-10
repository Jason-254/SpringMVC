package com.atituigu.com.controller;

public class User {
    private String username;
    private String password;
    private String sex;
    private String age;
    private String email;

    public User(String username, String password, String sex, String age, String email) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }
}
