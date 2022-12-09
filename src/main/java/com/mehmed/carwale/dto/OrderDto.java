package com.mehmed.carwale.dto;

import java.io.Serializable;

public class OrderDto implements Serializable{

	private int orderId;
	private double amountPaid;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	@Override
	public String toString() {
		return "OrderDto [orderId=" + orderId + ", amountPaid=" + amountPaid + "]";
	}
	
}
