package com.example.sharedspacefinder.repository;

import com.example.sharedspacefinder.models.SpaceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<SpaceStatus,Integer> {
}
