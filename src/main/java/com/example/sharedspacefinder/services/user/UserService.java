package com.example.sharedspacefinder.services.user;

import com.example.sharedspacefinder.models.Role;
import com.example.sharedspacefinder.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void update(User user);
    User findByUserId(Integer id);
    void delete(Integer id);
    User findByUsername(String name);
    Iterable<User> findAll();
    User findByRefreshToken(String refreshToken);
    Optional<User> findById(Integer userId);
    Optional<User> findByEmail(String email);
    User saveUser(User user);
    Role saveRole(Role role);
    void addToUser(String userEmail, String roleName);
    Boolean existsByEmail(String email);
    User save(User user);
    Boolean existPassword(String password);
    Boolean existsByRefreshToken(String refreshToken);
    String getPasswordByEmail(String email);
    Boolean existsById(Integer userId);

    List<User> getAllUsers(Integer userId,String email, String name ,Integer pageNo, Integer pageSize , String sortBy, String sortDir);

    Boolean deleteUserByUserId(Integer userId);
}
