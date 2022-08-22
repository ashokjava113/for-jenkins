package com.jenkins.service;

import com.jenkins.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    User getUserById(long id);

    List<User> getAllUsers();

    void deleteUserById(long id);
}
