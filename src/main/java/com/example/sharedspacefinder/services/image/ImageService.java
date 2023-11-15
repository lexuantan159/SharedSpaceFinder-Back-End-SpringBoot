package com.example.sharedspacefinder.services.image;

import com.example.sharedspacefinder.models.Space;

import java.io.IOException;

public interface ImageService {

    void deleteImageBySpaceId(Space space) throws IOException;

}
