package org.umc_project.study.repository.shopRepository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.umc_project.study.domain.QShop;
import org.umc_project.study.domain.Shop;

import java.util.List;


@Repository
@RequiredArgsConstructor
public class ShopRepositoryImpl implements ShopRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;
    private final QShop shop = QShop.shop;

    @Override
    public List<Shop> searchStores(String name, Float rating){
        BooleanBuilder predicate = new BooleanBuilder();

        if (name != null){
            predicate.and(shop.name.eq(name));
        }

        if (rating != null){
            predicate.and(shop.rating.goe(rating));
        }

        return jpaQueryFactory
                .selectFrom(shop)
                .where(predicate)
                .fetch();
    }
}
