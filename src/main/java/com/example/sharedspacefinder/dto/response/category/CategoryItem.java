package com.example.sharedspacefinder.dto.response.category;

import com.example.sharedspacefinder.models.CategorySpace;

public class CategoryItem {

    private CategorySpace categorySpace;
    private Integer categoryQuantity;

    public CategoryItem() {
    }

    public CategoryItem(CategorySpace categorySpace, Integer categoryQuantity) {
        this.categorySpace = categorySpace;
        this.categoryQuantity = categoryQuantity;
    }

    public CategorySpace getCategorySpace() {
        return categorySpace;
    }

    public void setCategorySpace(CategorySpace categorySpace) {
        this.categorySpace = categorySpace;
    }

    public Integer getCategoryQuantity() {
        return categoryQuantity;
    }

    public void setCategoryQuantity(Integer categoryQuantity) {
        this.categoryQuantity = categoryQuantity;
    }
}
