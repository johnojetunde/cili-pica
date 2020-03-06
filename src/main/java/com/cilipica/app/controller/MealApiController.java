package com.cilipica.app.controller;

import com.cilipica.app.model.ModelApiResponse;
import com.cilipica.domain.model.Meal;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-06T21:29:52.991Z[GMT]")
@Controller
public class MealApiController implements MealApi {

    private static final Logger log = LoggerFactory.getLogger(MealApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public MealApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addMeal(@ApiParam(value = "Meal object that needs to be added to the restaurant", required = true)
                                        @Valid @RequestBody Meal body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteMeal(@ApiParam(value = "Meal id to delete", required = true) @PathVariable("mealId") Long mealId,
                                           @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Meal>> findMealsByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, soldout")
                                                        @Valid @RequestParam(value = "status", required = true) List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Meal>>(objectMapper.readValue("[ {\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"price\" : 1,\n  \"name\" : \"Burger\",\n  \"id\" : 0,\n  \"category\" : {\n    \"name\" : \"name\",\n    \"id\" : 6\n  },\n  \"status\" : \"available\"\n}, {\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"price\" : 1,\n  \"name\" : \"Burger\",\n  \"id\" : 0,\n  \"category\" : {\n    \"name\" : \"name\",\n    \"id\" : 6\n  },\n  \"status\" : \"available\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Meal>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Meal>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Meal> getMealById(@ApiParam(value = "ID of meal to return", required = true) @PathVariable("mealId") Long mealId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Meal>(objectMapper.readValue("{\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"price\" : 1,\n  \"name\" : \"Burger\",\n  \"id\" : 0,\n  \"category\" : {\n    \"name\" : \"name\",\n    \"id\" : 6\n  },\n  \"status\" : \"available\"\n}", Meal.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Meal>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Meal>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateMeal(@ApiParam(value = "Meal object that needs to be added to the restaurant", required = true)
                                           @Valid @RequestBody Meal body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateMealWithForm(@ApiParam(value = "ID of meal that needs to be updated", required = true)
                                                   @PathVariable("mealId") Long mealId,
                                                   @ApiParam(value = "")
                                                   @RequestParam(value = "name", required = false) String name,
                                                   @ApiParam(value = "") @RequestParam(value = "status", required = false) String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of meal to update", required = true)
                                                       @PathVariable("mealId") Long mealId,
                                                       @ApiParam(value = "") @RequestParam(value = "additionalMetadata", required = false)
                                                               String additionalMetadata,
                                                       @ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 0,\n  \"type\" : \"type\",\n  \"message\" : \"message\"\n}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
