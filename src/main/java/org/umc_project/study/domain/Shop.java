package org.umc_project.study.domain;

import jakarta.persistence.*;
import lombok.*;
import org.umc_project.study.domain.common.BaseEntity;
import org.umc_project.study.domain.enums.ShopStatus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Shop extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    private Float rating;

    private ShopStatus status;

    @Column(nullable = false)
    private String primary_address;

    private String detailed_address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
    private List<Mission> missionList = new ArrayList<>();

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + primary_address + '\'' +
                ", rating=" + rating +
                ", region=" + (region != null ? region.getName() : "N/A") +
                "}";
    }
}
