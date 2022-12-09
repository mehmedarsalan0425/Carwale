package com.mehmed.carwale.dto;

import java.io.Serializable;

public class BookDto implements Serializable{

	private int brandId;
	private String paymentMode;
	private double advancePaid;
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public double getAdvancePaid() {
		return advancePaid;
	}
	public void setAdvancePaid(double advancePaid) {
		this.advancePaid = advancePaid;
	}
	@Override
	public String toString() {
		return "BookDto [brandId=" + brandId + ", paymentMode=" + paymentMode + ", advancePaid=" + advancePaid + "]";
	}
	
}
