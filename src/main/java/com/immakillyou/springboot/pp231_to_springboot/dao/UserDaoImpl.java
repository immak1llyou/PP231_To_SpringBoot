package com.immakillyou.springboot.pp231_to_springboot.dao;

import com.immakillyou.springboot.pp231_to_springboot.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    @Transactional
    public void removeUserById(int id) {
        em.remove(em.find(User.class, id));
    }

    @Override
    @Transactional(readOnly = true)
    public User showUser(int id) {
        return em.find(User.class, id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return (List<User>) em.createQuery("select u from User u").getResultList();
    }

    @Override
    @Transactional
    public void updateUser(int id, User updatedUser) {
        User userToBeUpdated = em.find(User.class, id);
        userToBeUpdated.setName(updatedUser.getName());
        userToBeUpdated.setSurname(updatedUser.getSurname());
        userToBeUpdated.setEmail(updatedUser.getEmail());
        userToBeUpdated.setAge(updatedUser.getAge());
    }
}
