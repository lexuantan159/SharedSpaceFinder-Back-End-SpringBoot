package com.example.sharedspacefinder.services.category;

import com.example.sharedspacefinder.models.CategorySpace;

import java.util.List;

public interface CategoryService {

    List<CategorySpace> findAllCategory();

    CategorySpace getCategoryById(Integer categoryId);
    Boolean existsCategory(Integer categoryId);
}
