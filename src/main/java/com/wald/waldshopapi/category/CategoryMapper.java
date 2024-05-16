package com.wald.waldshopapi.category;

import org.springframework.stereotype.Service;

@Service
public class CategoryMapper {
    public CategoryDto toDto(Category category) {
        return new CategoryDto(
                category.getName(),
                category.getImageUrl()
        );
    }
}
