package org.umc_project.study.service.shopService;

import org.umc_project.study.domain.Shop;

import java.util.List;
import java.util.Optional;

public interface ShopQueryService {

    Optional<Shop> findShop(Long id);
    List<Shop> findShopsByNameAndRating(String name, Float rating);
}
