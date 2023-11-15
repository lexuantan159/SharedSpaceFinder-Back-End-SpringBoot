package com.example.sharedspacefinder.services.favorite;

import com.example.sharedspacefinder.models.Favourite;
import com.example.sharedspacefinder.models.Space;
import com.example.sharedspacefinder.models.User;

import java.util.List;

public interface FavoriteService {

    List<Favourite> favoritesByUserId(Integer userId, Integer pageNo, Integer pageSize);
    Boolean existsByUserId(Integer userId);
    Boolean existsBySpaceId(Integer spaceId);

    Favourite saveFavourite(Space space, User user);

    Boolean existsBySpaceIdAndUserId(Integer spaceId, Integer userId);
    Boolean existsByFavouriteIdAndUserId(Integer favouriteId, Integer userId);
    void deleteFavourite(Integer favouriteId);
    void deleteBySpaceIdAndUserId(Integer spaceId, Integer userId);
}
