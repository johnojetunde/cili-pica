package com.cilipica.persistence.entity;

import com.cilipica.domain.model.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public static CategoryEntity fromModel(Category categoryModel) {
        return CategoryEntity.builder()
                .id(categoryModel.getId())
                .name(categoryModel.getName())
                .build();
    }

    public Category toModel() {
        return Category.builder()
                .id(id)
                .name(name)
                .build();
    }
}
