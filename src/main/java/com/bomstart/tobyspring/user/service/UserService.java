package com.bomstart.tobyspring.user.service;

import com.bomstart.tobyspring.user.domain.User;

import java.util.List;

public interface UserService {
    public User getUser(String id);
    public List<User> getUsers();
    public User updateUser(User user);
}