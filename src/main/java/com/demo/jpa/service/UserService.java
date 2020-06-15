package com.demo.jpa.service;

import com.demo.jpa.entity.User;
import com.demo.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){

        return userRepository.findAll();
    }

}
