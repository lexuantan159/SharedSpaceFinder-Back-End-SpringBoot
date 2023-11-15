package com.example.sharedspacefinder.repository;

import com.example.sharedspacefinder.models.Image;
import com.example.sharedspacefinder.models.Space;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, String> {
    List<Image> findBySpaceId(Space spaceId);
}
