package com.wald.waldshopapi.home;

import com.wald.waldshopapi.category.CategoryDto;
import com.wald.waldshopapi.promo.PromoDto;

import java.util.List;

public record HomeResponseDto(
        List<CategoryDto> categories,
        List<PromoDto> promos
) {}
