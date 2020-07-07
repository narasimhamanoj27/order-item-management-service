package com.orderitem.service;

import org.springframework.stereotype.Component;

import com.orderitem.entity.OrderItem;

import java.util.List;

@Component
public interface IOrderItemService {

	List<OrderItem> getAllOrderItems();

	List<OrderItem> getOrderItemDetail(int id);
	
	List<OrderItem> postOrderItemDetail(List<OrderItem> orderItem);
}
