package com.example.sharedspacefinder.repository;

import com.example.sharedspacefinder.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value= "Select * from user where user_name = :name ",nativeQuery = true)
    User findByUsername(String name);
    User findByRefreshToken(String refreshToken);
    String getPasswordByEmail(String email);
    Optional<User> findByEmail(String email);
    Optional<User> findById(Integer userId);
    Boolean existsByEmail(String email);
    Boolean existsByPassword(String password);
    Boolean existsByRefreshToken(String refreshToken);
    Page<User> findByEmailContaining(String email, Pageable pageable);
    Page<User> findByIdAndEmailContaining(Integer userId, String email, Pageable pageable);
    Page<User> findByIdAndNameContaining(Integer userId, String name, Pageable pageable);
    Page<User> findByNameContaining(String name, Pageable pageable);


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM favourite WHERE user_id = :userId", nativeQuery = true)
    void deleteFavoriteByUserId(@Param("userId") Integer userId);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM space WHERE owner_id = :userId",nativeQuery = true)
    void deleteSpaceByUserId(@Param("userId") Integer userId);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM feedback WHERE user_receive_feed_back_id = :userId or user_send_feed_back_id = :userId",nativeQuery = true)
    void deleteFeedbackByUserId(@Param("userId") Integer userId);

    @Modifying
    @Query(value = "DELETE FROM users_role WHERE users_id = :userId",nativeQuery = true)
    void deleteUsersRoleByUserId(@Param("userId") Integer userId);



}
