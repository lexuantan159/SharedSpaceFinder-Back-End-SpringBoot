package com.example.sharedspacefinder.services.auth;

import com.example.sharedspacefinder.models.User;
import com.example.sharedspacefinder.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class AuthService {
    private static final Logger logger = LoggerFactory.getLogger(AuthService.class);

    @Autowired
    private UserRepository userRepository;

    public Boolean findUserByRefreshToken(String refreshToken) {
        return userRepository.existsByRefreshToken(refreshToken);
    }

    @Transactional
    public void saveRefreshToken(String userEmail, String refreshToken) {
        Optional<User> user = userRepository.findByEmail(userEmail);

        if (user.isPresent()) {
            System.out.println(user.get().getRefreshToken());
            user.get().setRefreshToken(refreshToken);
            userRepository.save(user.get());
            System.out.println(user.get().getRefreshToken());
        }else
            logger.error("Can Not save refresh token");
    }


    public Boolean findUserByEmail(String userEmail) {
        Optional<User> user = userRepository.findByEmail(userEmail);
        return user.isPresent();
    }

    public Boolean existPassword(String password) {
        return userRepository.existsByPassword(password);
    }
}
