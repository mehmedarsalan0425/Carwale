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
@Table(name=AppConstant.BRAND_INFO)
public class Brand implements Serializable{

	@Id
	@GenericGenerator(name="b_info",strategy = "increment")
	@GeneratedValue(generator = "b_info")
	@Column(name="")
	private int brandId;
	@Column(name="brand_name")
	private String brandName;
	@Column(name="established_year")
	private String establishedYear;
	@Column(name="head_quarters")
	private String headQuarters;
	@Column(name="ceo_name")
	private String ceoName;
	@Column(name="brand_value")
	private double brandValue;
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getEstablishedYear() {
		return establishedYear;
	}
	public void setEstablishedYear(String establishedYear) {
		this.establishedYear = establishedYear;
	}
	public String getHeadQuarters() {
		return headQuarters;
	}
	public void setHeadQuarters(String headQuarters) {
		this.headQuarters = headQuarters;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public double getBrandValue() {
		return brandValue;
	}
	public void setBrandValue(double brandValue) {
		this.brandValue = brandValue;
	}
	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", establishedYear=" + establishedYear
				+ ", headQuarters=" + headQuarters + ", ceoName=" + ceoName + ", brandValue=" + brandValue + "]";
	}
	
}
