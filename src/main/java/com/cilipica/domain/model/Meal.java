package com.cilipica.domain.model;

import com.cilipica.domain.enums.MealStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Meal
 */
@Validated
@Builder
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-06T21:29:52.991Z[GMT]")
public class Meal {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("category")
    private Category category = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("price")
    private Integer price = null;

    @JsonProperty("photoUrls")
    @Valid
    private List<String> photoUrls = new ArrayList<String>();

    @JsonProperty("status")
    private MealStatus status = null;

    public Meal id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Meal category(Category category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     *
     * @return category
     **/
    @ApiModelProperty(value = "")

    @Valid
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Meal name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(example = "Burger", required = true, value = "")
    @NotNull

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Meal price(Integer price) {
        this.price = price;
        return this;
    }

    /**
     * Price in cents
     *
     * @return price
     **/
    @ApiModelProperty(required = true, value = "Price in cents")
    @NotNull

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Meal photoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
        return this;
    }

    public Meal addPhotoUrlsItem(String photoUrlsItem) {
        this.photoUrls.add(photoUrlsItem);
        return this;
    }

    /**
     * Get photoUrls
     *
     * @return photoUrls
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public Meal status(MealStatus status) {
        this.status = status;
        return this;
    }

    /**
     * meal status in the restaurant
     *
     * @return status
     **/
    @ApiModelProperty(value = "meal status in the restaurant")

    public MealStatus getStatus() {
        return status;
    }

    public void setStatus(MealStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Meal meal = (Meal) o;
        return Objects.equals(this.id, meal.id) &&
                Objects.equals(this.category, meal.category) &&
                Objects.equals(this.name, meal.name) &&
                Objects.equals(this.price, meal.price) &&
                Objects.equals(this.photoUrls, meal.photoUrls) &&
                Objects.equals(this.status, meal.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name, price, photoUrls, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Meal {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
