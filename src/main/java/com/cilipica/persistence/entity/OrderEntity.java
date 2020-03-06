package com.cilipica.persistence.entity;

import com.cilipica.domain.enums.OrderStatus;
import com.cilipica.domain.model.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.threeten.bp.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long mealId;
    private Integer quantity;
    private OffsetDateTime deliveryDate;
    private OrderStatus status;
    private Boolean complete;

    public static OrderEntity fromModel(Order orderModel) {
        return OrderEntity.builder()
                .id(orderModel.getId())
                .complete(orderModel.isComplete())
                .deliveryDate(orderModel.getDeliveryDate())
                .mealId(orderModel.getMealId())
                .quantity(orderModel.getQuantity())
                .status(orderModel.getStatus())
                .build();
    }

    public Order toModel() {
        return Order.builder()
                .id(id)
                .complete(complete)
                .deliveryDate(deliveryDate)
                .mealId(mealId)
                .quantity(quantity)
                .status(status)
                .build();
    }
}
