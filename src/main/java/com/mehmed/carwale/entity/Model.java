package com.mehmed.carwale.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.mehmed.carwale.constant.AppConstant;

@Entity
@Table(name=AppConstant.MODEL_INFO)
public class Model implements Serializable{

	@Id
	@GenericGenerator(name="m_info",strategy = "increment")
	@GeneratedValue(generator = "m_info")
	@Column(name="")
	private int modelId;
	@Column(name="model_name")
	private String modelName;
	@Column(name="brand_id")
	private int brandId;
	@Column(name="price")
	private double price;
	@Column(name="type")
	private String type;
	@Column(name="color")
	private String color;
	@Column(name="version")
	private String version;
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Model [modelId=" + modelId + ", modelName=" + modelName + ", brandId=" + brandId + ", price=" + price
				+ ", type=" + type + ", color=" + color + ", version=" + version + "]";
	}
	
	
	
}
