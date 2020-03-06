package com.cilipica.persistence.repository;

import com.cilipica.persistence.entity.MealEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends JpaRepository<MealEntity, Long> {
    List<MealEntity> findMealEntitiesByStatusIsIn(List<String> status);
}
