package com.orderitem.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderitem.entity.OrderItem;
import com.orderitem.repository.OrderItemRepository;
import com.orderitem.service.IOrderItemService;

@Service
public class OrderItemServiceImpl implements IOrderItemService{

	@Autowired
	OrderItemRepository orderItemRepository;
	
	/**
	 * Implementation for retrieving all the Order Item details from H2 DB
	 */
	@Override
	public List<OrderItem> getAllOrderItems() {
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		orderItemRepository.findAll().forEach(orderItem -> orderItems.add(orderItem));
		return orderItems;
	}

	/**
	 * Implementation for retrieving Order Item details based on customer ID from H2 DB
	 */
	@Override
	public List<OrderItem> getOrderItemDetail(int id) {
		return orderItemRepository.findAllByCustomerId(id);
	}

	/**
	 * Implementation of saving a list of Order item details into H2 DB
	 */
	@Override
	public List<OrderItem> postOrderItemDetail(List<OrderItem> orderItems) {
		orderItems.forEach(orderItem -> orderItemRepository.save(orderItem));
		return orderItems;
	}

}
