package com.microservices.UserService.service;

import com.microservices.UserService.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String id);
}
