package com.peace.dao;


import com.peace.domain.User;

public interface UserDao {
    public void savaUser(User user) ;
    public User findUserByName(String name);
    public User findUserById(int id);
    public void updateUser(User user);
    public void remove(User user);
}