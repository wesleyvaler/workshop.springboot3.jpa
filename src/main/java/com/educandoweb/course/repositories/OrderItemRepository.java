package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.copy.OrderItemPK;



public interface OrderItemRepository extends JpaRepository <OrderItem, OrderItemPK> {
	
	
}