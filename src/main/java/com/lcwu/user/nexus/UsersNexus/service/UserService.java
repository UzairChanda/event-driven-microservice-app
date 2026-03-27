package com.lcwu.user.nexus.UsersNexus.service;

import com.lcwu.user.nexus.UsersNexus.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUser(String userId);
}
