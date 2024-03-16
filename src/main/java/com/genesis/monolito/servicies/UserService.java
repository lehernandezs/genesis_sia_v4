package com.genesis.monolito.servicies;

import com.genesis.monolito.models.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User editUser(Long id, User user);


}
