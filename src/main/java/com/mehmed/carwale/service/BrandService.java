package com.mehmed.carwale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.carwale.entity.Brand;
import com.mehmed.carwale.repository.BrandRepository;

@Service
public class BrandService {

	@Autowired
	private BrandRepository brandRepository;

	public void saveBrandDetails(Brand brand) {
		brandRepository.save(brand);
	}

	public List<Brand> getBrandDetails() {
		return brandRepository.findAll();
	}

}
