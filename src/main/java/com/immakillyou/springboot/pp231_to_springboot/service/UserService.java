package com.immakillyou.springboot.pp231_to_springboot.service;

import com.immakillyou.springboot.pp231_to_springboot.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void removeUserById(int id);

    User showUser(int id);

    List<User> getAllUsers();

    void updateUser(int id, User updatedUser);
}
