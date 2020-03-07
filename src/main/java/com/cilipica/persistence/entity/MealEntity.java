package com.cilipica.persistence.entity;

import com.cilipica.domain.enums.MealStatus;
import com.cilipica.domain.model.Meal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MealEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private CategoryEntity categoryEntity;
    private String name;
    private Integer price;
    @ElementCollection
    private List<String> photoUrls;
    @Enumerated(EnumType.STRING)
    private MealStatus status;

    public static MealEntity fromModel(Meal mealModel) {
        return MealEntity.builder()
                .id(mealModel.getId())
                .categoryEntity(CategoryEntity.fromModel(mealModel.getCategory()))
                .name(mealModel.getName())
                .price(mealModel.getPrice())
                .status(mealModel.getStatus())
                .photoUrls(mealModel.getPhotoUrls())
                .build();
    }

    public Meal toModel() {
        return Meal.builder()
                .id(id)
                .category(categoryEntity.toModel())
                .name(name)
                .price(price)
                .status(status)
                .photoUrls(photoUrls)
                .build();
    }
}
