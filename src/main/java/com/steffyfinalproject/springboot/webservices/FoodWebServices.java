package com.steffyfinalproject.springboot.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.steffyfinalproject.springboot.entities.Vendor;
import com.steffyfinalproject.springboot.services.FoodService;

@RestController
public class FoodWebServices {

	@Autowired
	FoodService foodService;

	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}
	@RequestMapping(value="/food/vendors",  method=RequestMethod.GET)
	public List<Vendor> getvendors() {
		return foodService.getVendors();
	}
}
