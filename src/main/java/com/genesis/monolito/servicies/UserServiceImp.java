package com.genesis.monolito.servicies;

import com.genesis.monolito.models.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Override
    public User createUser(User user) {
        return User.builder()
                .fullName("Pepito")
                .id(5L)
                .birthDay(LocalDate.parse("2024-02-22"))
                .email("le@gmail.com")
                .build();
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User editUser(Long id, User user) {
        return null;
    }
}
