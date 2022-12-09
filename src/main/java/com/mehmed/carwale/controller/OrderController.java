package com.mehmed.carwale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.carwale.constant.AppConstant;
import com.mehmed.carwale.dto.BookDto;
import com.mehmed.carwale.dto.OrderDto;
import com.mehmed.carwale.entity.OrderDetails;
import com.mehmed.carwale.service.OrderService;

@RestController
@RequestMapping(value = AppConstant.FORWARD_SLASH)
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping(value = AppConstant.BOOK)
	public void book(@RequestBody BookDto bookDto) {
		orderService.book(bookDto);
	}

	@PostMapping(value = AppConstant.DELIVER_ORDER)
	public void deliverOrder(@RequestBody OrderDto orderDto) {
		orderService.deliverOrder(orderDto);
	}
}
