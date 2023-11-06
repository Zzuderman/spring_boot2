package com.spring_boot.spring_boot2.service;

import com.spring_boot.spring_boot2.dao.UserRepository;
import com.spring_boot.spring_boot2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsersList() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        User user = null;
        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()) {
            user = optional.get();
        }
        return user;
    }

    @Override

    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Object deleteUser(int id) {
        userRepository.deleteById(id);
        return null;
    }

    @Override
    public void editUser(User user) {
        userRepository.save(user);
    }
}
