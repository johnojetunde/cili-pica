package com.cilipica.domain.service;

import com.cilipica.domain.exception.CiliPicaServiceException;
import com.cilipica.domain.model.Order;
import com.cilipica.persistence.entity.OrderEntity;
import com.cilipica.persistence.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultOrderService implements OrderService {
    private OrderRepository repository;

    @Autowired
    public DefaultOrderService(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteOrder(Long orderId) throws CiliPicaServiceException {
        try {
            repository.deleteById(orderId);
        } catch (Exception e) {
            throw new CiliPicaServiceException("Error deleting order", e);
        }
    }

    @Override
    public Order getOrderById(Long orderId) throws CiliPicaServiceException {
        var result = repository.findById(orderId);
        if (result.isPresent()) {
            return result.get().toModel();
        }
        throw new CiliPicaServiceException("Unable to find Order by id");
    }

    @Override
    public Order placeOrder(Order body) throws CiliPicaServiceException {
        try {
            return repository.save(OrderEntity.fromModel(body)).toModel();
        } catch (Exception e) {
            throw new CiliPicaServiceException("Unable to place order", e);
        }
    }
}
