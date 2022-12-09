package com.mehmed.carwale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.carwale.constant.AppConstant;
import com.mehmed.carwale.entity.Brand;
import com.mehmed.carwale.service.BrandService;

@RestController
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@PostMapping(value=AppConstant.SAVE_BRAND_DETAILS)
	public void saveBrandDetails(@RequestBody Brand brand)
	{
		brandService.saveBrandDetails(brand);
	}
	
	@GetMapping(value=AppConstant.GET_BRAND_DETAILS)
	public List<Brand> saveBrandDetails()
	{
		return brandService.getBrandDetails();
	}
}
