package com.cilipica.domain.model;

import com.cilipica.domain.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Objects;

/**
 * Order
 */
@Validated
@Builder
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-06T21:29:52.991Z[GMT]")
public class Order {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("mealId")
    private Long mealId = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("deliveryDate")
    private OffsetDateTime deliveryDate = null;

    @JsonProperty("status")
    private OrderStatus status = null;

    @JsonProperty("complete")
    private Boolean complete = false;

    public Order id(Long id) {
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

    public Order mealId(Long mealId) {
        this.mealId = mealId;
        return this;
    }

    /**
     * Get mealId
     *
     * @return mealId
     **/
    @ApiModelProperty(value = "")

    public Long getMealId() {
        return mealId;
    }

    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }

    public Order quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     *
     * @return quantity
     **/
    @ApiModelProperty(value = "")

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Order deliveryDate(OffsetDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }

    /**
     * Get deliveryDate
     *
     * @return deliveryDate
     **/
    @ApiModelProperty(value = "")

    @Valid
    public OffsetDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(OffsetDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Order status(OrderStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Order Status
     *
     * @return status
     **/
    @ApiModelProperty(value = "Order Status")

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Order complete(Boolean complete) {
        this.complete = complete;
        return this;
    }

    /**
     * Get complete
     *
     * @return complete
     **/
    @ApiModelProperty(value = "")

    public Boolean isComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(this.id, order.id) &&
                Objects.equals(this.mealId, order.mealId) &&
                Objects.equals(this.quantity, order.quantity) &&
                Objects.equals(this.deliveryDate, order.deliveryDate) &&
                Objects.equals(this.status, order.status) &&
                Objects.equals(this.complete, order.complete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mealId, quantity, deliveryDate, status, complete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Order {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mealId: ").append(toIndentedString(mealId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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
