package com.mehmed.carwale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehmed.carwale.constant.AppConstant;
import com.mehmed.carwale.entity.Model;
import com.mehmed.carwale.service.ModelService;

@RestController
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class ModelController {

	@Autowired
	private ModelService modelService;
	
	@PostMapping(value=AppConstant.SAVE_ALL_MODEL_DETAILS)
	public void saveAllModelDetails(@RequestBody List<Model> model)
	{
		modelService.saveAllModelDetails(model);
	}
	
	@GetMapping(value=AppConstant.GET_ALL_MODEL_DETAILS)
	public @ResponseBody List<Model> getAllModelDetails()
	{
		return modelService.getAllModelDetails();
	}
}
