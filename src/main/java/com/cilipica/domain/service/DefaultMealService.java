package com.cilipica.domain.service;

import com.cilipica.app.model.ModelApiResponse;
import com.cilipica.domain.exception.CiliPicaServiceException;
import com.cilipica.domain.model.Meal;
import com.cilipica.persistence.entity.MealEntity;
import com.cilipica.persistence.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

import static com.cilipica.persistence.entity.MealEntity.fromModel;

@Service
public class DefaultMealService implements MealService {
    private MealRepository repository;

    @Autowired
    public DefaultMealService(MealRepository repository) {
        this.repository = repository;
    }

    @Override
    public Meal addMeal(Meal body) throws CiliPicaServiceException {
        try {
            return repository.save(fromModel(body)).toModel();
        } catch (Exception e) {
            throw new CiliPicaServiceException("Error adding meal", e);
        }
    }

    @Override
    public void deleteMeal(Long mealId, String apiKey) throws CiliPicaServiceException {
        try {
            repository.deleteById(mealId);
        } catch (Exception e) {
            throw new CiliPicaServiceException("Error deleting meal", e);
        }
    }

    @Override
    public List<Meal> findMealsByStatus(List<String> status) throws CiliPicaServiceException {
        try {
            return repository.findMealEntitiesByStatusIsIn(status)
                    .stream()
                    .map(MealEntity::toModel)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new CiliPicaServiceException("Error deleting meal", e);
        }
    }

    @Override
    public Meal getMealById(Long mealId) throws CiliPicaServiceException {
        var result = repository.findById(mealId);
        if (result.isPresent()) {
            return result.get().toModel();
        }
        throw new CiliPicaServiceException("Unable to find meal by id");
    }

    @Override
    public Meal updateMeal(Meal body) throws CiliPicaServiceException {
        return addMeal(body);
    }

    @Override
    public Meal updateMealWithForm(Long mealId, String name, String status) throws CiliPicaServiceException {
        throw new CiliPicaServiceException("Not supported");
    }

    @Override
    public ModelApiResponse uploadFile(Long mealId, String additionalMetadata, MultipartFile file) throws CiliPicaServiceException {
        throw new CiliPicaServiceException("Not supported");
    }
}
