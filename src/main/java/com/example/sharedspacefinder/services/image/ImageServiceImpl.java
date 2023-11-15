package com.example.sharedspacefinder.services.image;


import com.example.sharedspacefinder.models.Image;
import com.example.sharedspacefinder.models.Space;
import com.example.sharedspacefinder.repository.ImageRepository;
import com.example.sharedspacefinder.services.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService{

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    CloudinaryService cloudinaryService;

    @Transactional
    @Override
    public void deleteImageBySpaceId(Space space) throws IOException {
        List<Image> listImages = imageRepository.findBySpaceId(space);
        if(!listImages.isEmpty()) {
            for (Image image : listImages) {
                imageRepository.deleteById(image.getImageId());
                cloudinaryService.delete(image.getImageId());
            }
        }
    }
}
