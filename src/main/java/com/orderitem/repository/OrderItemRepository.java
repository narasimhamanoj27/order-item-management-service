package com.orderitem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.orderitem.entity.OrderItem;

/**
 * Repository for performing CRUD operations on OrderItem POJO
 * @author manoj
 *
 */
@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Integer>{
	
	List<OrderItem> findAllByCustomerId(int customerId);

}
