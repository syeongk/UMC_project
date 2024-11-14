package org.umc_project.study.service.shopService;

import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.umc_project.study.domain.Shop;
import org.umc_project.study.repository.shopRepository.ShopRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ShopQueryServiceImpl implements ShopQueryService {

    private final ShopRepository shopRepository;

    @Override
    public Optional<Shop> findShop(Long id){
        return shopRepository.findById(id);
    }

    @Override
    public List<Shop> findShopsByNameAndRating(String name, Float rating){
        List<Shop> filteredShops = shopRepository.searchStores(name, rating);

        filteredShops.forEach(store -> System.out.println("Store" + store));

        return filteredShops;
    }
}
