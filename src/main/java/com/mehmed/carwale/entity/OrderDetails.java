package com.mehmed.carwale.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.mehmed.carwale.constant.AppConstant;

@Entity
@Table(name=AppConstant.ORDER_DETAILS)
public class OrderDetails implements Serializable{

	
	@Id
	@GenericGenerator(name="o_info",strategy = "increment")
	@GeneratedValue(generator = "o_info")
	@Column(name="order_id")
	private int id;
	@Column(name="brand_id")
	private int brandId;
	@Column(name="payment_mode")
	private String paymentMode;
	@Column(name="ordered_date")
	private Date orderedDate;
	@Column(name="delivered_date")
	private Date deliveredDate;
	@Column(name="is_delivered")
	private boolean isDelivered;
	@Column(name="advance_paid")
	private double advancePaid;
	@Column(name="total_amount_received")
	private double totalAmountReceived;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Date getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}
	public Date getDeliveredDate() {
		return deliveredDate;
	}
	public void setDeliveredDate(Date deliveredDate) {
		this.deliveredDate = deliveredDate;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	public double getAdvancePaid() {
		return advancePaid;
	}
	public void setAdvancePaid(double advancePaid) {
		this.advancePaid = advancePaid;
	}
	public double getTotalAmountReceived() {
		return totalAmountReceived;
	}
	public void setTotalAmountReceived(double totalAmountReceived) {
		this.totalAmountReceived = totalAmountReceived;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", brandId=" + brandId + ", paymentMode=" + paymentMode + ", orderedDate="
				+ orderedDate + ", deliveredDate=" + deliveredDate + ", isDelivered=" + isDelivered + ", advancePaid="
				+ advancePaid + ", totalAmountReceived=" + totalAmountReceived + "]";
	}
	
	
}
