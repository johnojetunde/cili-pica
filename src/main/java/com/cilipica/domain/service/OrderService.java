package com.cilipica.domain.service;

import com.cilipica.domain.exception.CiliPicaServiceException;
import com.cilipica.domain.model.Order;

public interface OrderService {
    void deleteOrder(Long orderId) throws CiliPicaServiceException;

    Order getOrderById(Long orderId) throws CiliPicaServiceException;

    Order placeOrder(Order body) throws CiliPicaServiceException;
}
