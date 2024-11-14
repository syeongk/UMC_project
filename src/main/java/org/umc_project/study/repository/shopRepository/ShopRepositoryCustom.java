package org.umc_project.study.repository.shopRepository;

import org.umc_project.study.domain.Shop;
import java.util.List;

public interface ShopRepositoryCustom {

    List<Shop> searchStores(String name, Float rating);
}
