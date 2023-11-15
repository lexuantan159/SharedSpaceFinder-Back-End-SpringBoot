package com.example.sharedspacefinder.repository;

import com.example.sharedspacefinder.models.CategorySpace;
import com.example.sharedspacefinder.models.Space;
import com.example.sharedspacefinder.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface SpaceRepository extends JpaRepository<Space, Integer> {

    Optional<Space> findById(Integer spaceId);
    Integer countByCategoryId_Id(Integer category);
    void deleteAllByOwnerId_Id(Integer userId);

    @Query("SELECT s FROM Space s " +
            "WHERE (:status IS NULL OR s.status.id = :status) " +
            "AND (:categoryId IS NULL OR s.categoryId.id = :categoryId) " +
            "AND (:searchByProvince IS NULL OR s.province = :searchByProvince) " +
            "AND (:searchByDistrict IS NULL OR s.district = :searchByDistrict) " +
            "AND (:searchByWard IS NULL OR s.ward = :searchByWard) " +
            "AND (:priceFrom IS NULL OR s.price >= :priceFrom) " +
            "AND (:priceTo IS NULL OR s.price <= :priceTo) " +
            "AND (:areaFrom IS NULL OR s.area >= :areaFrom) " +
            "AND (:areaTo IS NULL OR s.area <= :areaTo) " +
            "AND (:spaceId IS NULL OR s.id = :spaceId)" +
            "AND (:ownerId IS NULL OR s.ownerId.id = :ownerId)")
    Page<Space> findSpacesByConditions(
            @Param("status") Integer status,
            @Param("categoryId") Integer categoryId,
            @Param("searchByProvince") String searchByProvince,
            @Param("searchByDistrict") String searchByDistrict,
            @Param("searchByWard") String searchByWard,
            @Param("priceFrom") BigDecimal priceFrom,
            @Param("priceTo") BigDecimal priceTo,
            @Param("areaFrom") Float areaFrom,
            @Param("areaTo") Float areaTo,
            @Param("spaceId") Integer spaceId,
            @Param("ownerId") Integer ownerId,
            Pageable pageable
    );

    @Transactional
    @Modifying
    @Query("UPDATE Space s SET " +
            "s.title = COALESCE(:title, s.title), " +
            "s.price = COALESCE(:price, s.price), " +
            "s.description = COALESCE(:description, s.description), " +
            "s.bathroomNumbers = COALESCE(:bathroomNumbers, s.bathroomNumbers), " +
            "s.bedroomNumbers = COALESCE(:bedroomNumbers, s.bedroomNumbers), " +
            "s.peopleNumbers = COALESCE(:peopleNumbers, s.peopleNumbers), " +
            "s.area = COALESCE(:area, s.area), " +
            "s.province = COALESCE(:province, s.province), " +
            "s.district = COALESCE(:district, s.district), " +
            "s.ward = COALESCE(:ward, s.ward), " +
            "s.address = COALESCE(:address, s.address), " +
            "s.categoryId = COALESCE(:categoryId, s.categoryId) " +
            "WHERE s.id = :spaceId")
    void updateSpace(
            @Param("title") String title,
            @Param("price") BigDecimal price,
            @Param("description") String description,
            @Param("bathroomNumbers") Integer bathroomNumbers,
            @Param("bedroomNumbers") Integer bedroomNumbers,
            @Param("peopleNumbers") Integer peopleNumbers,
            @Param("area") Float area,
            @Param("province") String province,
            @Param("district") String district,
            @Param("ward") String ward,
            @Param("address") String address,
            @Param("categoryId") CategorySpace categorySpace,
            @Param("spaceId") Integer spaceId
    );


    Optional<Space> findSpaceByIdAndOwnerId(Integer id, User owner);
}
