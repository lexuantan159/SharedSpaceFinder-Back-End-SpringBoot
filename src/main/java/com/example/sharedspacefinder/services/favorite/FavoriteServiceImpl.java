package com.example.sharedspacefinder.services.favorite;

import com.example.sharedspacefinder.models.Favourite;
import com.example.sharedspacefinder.models.Space;
import com.example.sharedspacefinder.models.User;
import com.example.sharedspacefinder.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    FavoriteRepository favoriteRepository;


    @Override
    public List<Favourite> favoritesByUserId(Integer userId , Integer pageNo, Integer pageSize) {

        try {
            Pageable pageable = PageRequest.of(pageNo, pageSize);
            Page<Favourite> favouritesByUserId = favoriteRepository.findAllByUserId(userId,pageable);

            return favouritesByUserId.getContent();
        }catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Boolean existsByUserId(Integer userId) {
        return favoriteRepository.existsByUserId(userId);
    }

    @Override
    public Boolean existsBySpaceId(Integer spaceId) {
        return favoriteRepository.existsBySpaceId(spaceId);
    }

    @Override
    public Favourite saveFavourite(Space space, User user) {
        Favourite favorite = new Favourite(space, user);
       return  favoriteRepository.save(favorite);
    }

    @Override
    public Boolean existsBySpaceIdAndUserId(Integer spaceId, Integer userId) {
        return favoriteRepository.existsBySpaceIdAndUserId(spaceId, userId);
    }

    @Override
    public Boolean existsByFavouriteIdAndUserId(Integer favouriteId, Integer userId) {
        return favoriteRepository.existsByIdAndUserId(favouriteId, userId);
    }

    @Override
    @Transactional
    public void deleteFavourite(Integer favouriteId) {
        favoriteRepository.deleteById(favouriteId);
    }

    @Override
    @Transactional
    public void deleteBySpaceIdAndUserId(Integer spaceId, Integer userId) {
        favoriteRepository.deleteBySpaceIdAndUserId(spaceId ,userId);
    }

}
