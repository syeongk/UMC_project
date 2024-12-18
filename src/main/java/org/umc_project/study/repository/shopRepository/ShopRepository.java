package org.umc_project.study.repository.shopRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.umc_project.study.domain.Shop;

public interface ShopRepository extends JpaRepository<Shop, Long>, ShopRepositoryCustom {
}
