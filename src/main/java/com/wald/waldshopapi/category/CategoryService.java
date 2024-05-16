package com.wald.waldshopapi.category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryService(
            CategoryRepository cRepository,
            CategoryMapper cMapper
    ) {
        this.categoryRepository = cRepository;
        this.categoryMapper = cMapper;
    }

    public List<CategoryDto> findAll() {
        List<Category> categories = this.categoryRepository.findAll();

        return categories.stream().map(this.categoryMapper::toDto).toList();
    }
}
