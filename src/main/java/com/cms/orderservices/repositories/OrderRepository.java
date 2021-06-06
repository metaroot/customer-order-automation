package com.cms.orderservices.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cms.orderservices.entities.Order;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
