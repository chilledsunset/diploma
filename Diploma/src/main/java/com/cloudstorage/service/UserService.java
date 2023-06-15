package com.cloudstorage.service;

import com.cloudstorage.entities.User;


public interface UserService {
    void registration(User user);
    User findByUsername(String username);

}
