package com.spring_boot.spring_boot2.service;

import com.spring_boot.spring_boot2.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();
    User getUser(int id);
    void addUser(User user);
    Object deleteUser(int id);
    void editUser(User user);
}