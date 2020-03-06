package com.cilipica.domain.service;

import com.cilipica.app.model.ModelApiResponse;
import com.cilipica.domain.exception.CiliPicaServiceException;
import com.cilipica.domain.model.Meal;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface MealService {
    Meal addMeal(Meal body) throws CiliPicaServiceException;

    void deleteMeal(Long mealId, String apiKey) throws CiliPicaServiceException;

    List<Meal> findMealsByStatus(List<String> status) throws CiliPicaServiceException;

    Meal getMealById(Long mealId) throws CiliPicaServiceException;

    Meal updateMeal(Meal body) throws CiliPicaServiceException;

    Meal updateMealWithForm(Long mealId,
                            String name,
                            String status) throws CiliPicaServiceException;

    ModelApiResponse uploadFile(Long mealId,
                                String additionalMetadata,
                                MultipartFile file) throws CiliPicaServiceException;
}
