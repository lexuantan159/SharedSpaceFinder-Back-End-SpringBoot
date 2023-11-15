package com.example.sharedspacefinder.services.user;

import com.example.sharedspacefinder.models.Role;
import com.example.sharedspacefinder.models.User;
import com.example.sharedspacefinder.repository.FavoriteRepository;
import com.example.sharedspacefinder.repository.RoleRepository;
import com.example.sharedspacefinder.repository.SpaceRepository;
import com.example.sharedspacefinder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    FavoriteRepository favoriteRepository;

    @Autowired
    SpaceRepository spaceRepository;


    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Boolean existPassword(String password) {
        return userRepository.existsByPassword(password);
    }

    @Override
    public Boolean existsByRefreshToken(String refreshToken) {
        return userRepository.existsByRefreshToken(refreshToken);
    }

    @Override
    public String getPasswordByEmail(String email) {
        return userRepository.getPasswordByEmail(email);
    }

    @Override
    public Boolean existsById(Integer userId) {
        return userRepository.existsById(userId);
    }

    @Override
    public List<User> getAllUsers(Integer userId, String email, String name, Integer pageNo, Integer pageSize, String sortBy, String sortDir) {
        try {
            // Create Sorted instance
            Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                    : Sort.by(sortBy).descending();
            // create Pageable instance
            Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
            // Get users by email and id
            if (!email.isEmpty()) {
                if (userId != null) {
                    Page<User> listUsersByEmail = userRepository.findByIdAndEmailContaining(userId, email, pageable);
                    return listUsersByEmail.getContent();
                }
                Page<User> listUsersByEmail = userRepository.findByEmailContaining(email, pageable);
                return listUsersByEmail.getContent();
            }
            // Get users by full name and id
            if (!name.isEmpty()) {
                if (userId != null) {
                    Page<User> listUsersByEmail = userRepository.findByIdAndNameContaining(userId, name, pageable);
                    return listUsersByEmail.getContent();
                }
                Page<User> listUsersByFullName = userRepository.findByNameContaining(name, pageable);
                return listUsersByFullName.getContent();
            }
            //get user by id
            if (userId != null) {
                Optional<User> userById = userRepository.findById(userId);
                List<User> users = new ArrayList<User>();
                userById.ifPresent(users::add);
                return users;
            }
            // get all users
            Page<User> listUsers = userRepository.findAll(pageable);
            return listUsers.getContent();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    @Transactional
    public Boolean deleteUserByUserId(Integer userId) {
        try {
            favoriteRepository.deleteByUserId_Id(userId);
            spaceRepository.deleteAllByOwnerId_Id(userId);
            userRepository.deleteById(userId);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByUserId(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findByUsername(String name) {
        return userRepository.findByUsername(name);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addToUser(String userEmail, String roleCode) {
        Optional<User> user = userRepository.findByEmail(userEmail);
        Optional<Role> role = roleRepository.findByRoleCode(roleCode);
        Set<Role> roles = new HashSet<>();
        // add role to Set Role
        role.ifPresent(roles::add);
        if (user.isPresent()) {
            user.get().setRoles(roles);
            userRepository.save(user.get());
        }

    }

    @Override
    public User findByRefreshToken(String refreshToken) {
        return userRepository.findByRefreshToken(refreshToken);
    }

    @Override
    public Optional<User> findById(Integer userId) {
        return userRepository.findById(userId);
    }
}
