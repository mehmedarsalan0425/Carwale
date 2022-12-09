package com.mehmed.carwale.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.carwale.dto.BookDto;
import com.mehmed.carwale.dto.OrderDto;
import com.mehmed.carwale.entity.OrderDetails;
import com.mehmed.carwale.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public void book(BookDto bookDto) {
		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setBrandId(bookDto.getBrandId());
		orderDetails.setPaymentMode(bookDto.getPaymentMode());
		orderDetails.setAdvancePaid(bookDto.getAdvancePaid());
		orderDetails.setOrderedDate(new java.util.Date());
		orderDetails.setDelivered(false);
		orderDetails.setTotalAmountReceived(bookDto.getAdvancePaid() + orderDetails.getTotalAmountReceived());

		orderRepository.save(orderDetails);
	}

	public OrderDetails getById(int id) {
		return orderRepository.getById(id);
	}

	public void deliverOrder(OrderDto orderDto) {
		Optional<OrderDetails> optional = orderRepository.findById(orderDto.getOrderId());
		OrderDetails orderDetails = optional.get();
		orderDetails.setTotalAmountReceived(orderDetails.getAdvancePaid() + orderDto.getAmountPaid());
		orderDetails.setDelivered(true);
		orderDetails.setDeliveredDate(new java.util.Date());
		orderRepository.save(orderDetails);
		
		
		
		
	}

}
