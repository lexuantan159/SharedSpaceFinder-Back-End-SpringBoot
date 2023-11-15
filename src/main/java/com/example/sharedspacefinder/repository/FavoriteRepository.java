package com.example.sharedspacefinder.repository;

import com.example.sharedspacefinder.models.Favourite;
import com.example.sharedspacefinder.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public interface FavoriteRepository extends JpaRepository<Favourite,Integer> {

    Page<Favourite> findAllByUserId(Integer userId,Pageable pageable);

    Boolean existsByUserId(Integer userId);
    Boolean existsBySpaceId(Integer spaceId);
    Boolean existsByIdAndUserId(Integer favoriteId, Integer userId);
    Boolean existsBySpaceIdAndUserId(Integer spaceId, Integer userId);

    void deleteBySpaceIdAndUserId(Integer spaceId, Integer userId);
    void deleteByUserId(Integer userId);
    void deleteByUserId_Id(Integer userId);
    @Transactional
    void deleteAllByUserId(Integer userId);

    @Transactional
    List<Favourite> findByUserId(Integer userId);

    List<Favourite> findByUser(User userToDelete);
}
