package com.mehmed.carwale.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.carwale.entity.Brand;
import com.mehmed.carwale.entity.Model;
import com.mehmed.carwale.repository.ModelRepository;

@Service
public class ModelService {

	@Autowired
	private ModelRepository modelRepository;
	
	
	public void saveAllModelDetails(List<Model> modelList) {
		modelRepository.saveAll(modelList);
	}

	public List<Model> getAllModelDetails() {
		return modelRepository.findAll();
	}

}
