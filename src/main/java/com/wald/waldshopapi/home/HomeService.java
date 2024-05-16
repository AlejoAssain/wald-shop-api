package com.wald.waldshopapi.home;

import com.wald.waldshopapi.category.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HomeService {
    private final CategoryService categoryService;

    public HomeService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public HomeResponseDto getHomeData() {
        return new HomeResponseDto(categoryService.findAll(), new ArrayList<>());
    }
}
