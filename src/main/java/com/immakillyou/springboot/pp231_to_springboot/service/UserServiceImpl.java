package com.immakillyou.springboot.pp231_to_springboot.service;

import com.immakillyou.springboot.pp231_to_springboot.dao.UserDao;
import com.immakillyou.springboot.pp231_to_springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void removeUserById(int id) {
        userDao.removeUserById(id);
    }

    @Override
    public User showUser(int id) {
        return userDao.showUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void updateUser(int id, User updatedUser) {
        userDao.updateUser(id, updatedUser);
    }
}
