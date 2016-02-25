package com.steffyfinalproject.springboot.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.steffyfinalproject.springboot.entities.Catagory;
import com.steffyfinalproject.springboot.entities.FavFood;
import com.steffyfinalproject.springboot.entities.Vendor;
import com.steffyfinalproject.springboot.services.FoodService;
 
@RestController
public class FoodWebServices {

	@Autowired
	FoodService foodService;

	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}
	/**
	 * Retrieve all Vendors 
	 * @return
	 */
	@RequestMapping(value="/food/vendors",  method=RequestMethod.GET)
	public List<Vendor> getvendors() {
		return foodService.getVendors();
	}
	/**
	 * Retrieve all Categories 
	 * @return
	 */
	@RequestMapping(value="/food/catagory",  method=RequestMethod.GET)
	public List<Catagory> getCatagories() {
		return foodService.getCategory();
	}
	/**
	 * Web service to Creates Fav Food 
	 */
	@RequestMapping(value="/food/createfood",method=RequestMethod.POST)
	public void createFood(@RequestBody FavFood favfood){
		System.out.println("inside Food Webservices services ");
		foodService.addFood(favfood);
	}
	/**
	 * Web service to get details about Fav Food 
	 */
	@RequestMapping(value="/food/favfood",method=RequestMethod.GET)
	public List<FavFood> getfavFoodDetails(){
	//	System.out.println("----------------------------->> inside Food Webservices services ");
		return foodService.getAllFavFood();
	}
    /**
     * WebService to retrieve all information about fav Food with corresponding ID
     */
	@RequestMapping(value="/food/id/{foodId}", method=RequestMethod.GET)
	public FavFood getFoodById(@PathVariable Integer foodId){
		return foodService.getFoodById(foodId);
	}
	/**
     * WebService to update fav Food with corresponding ID
     */
	@RequestMapping(value="/food/updatefood", method=RequestMethod.PUT)
	public void putfood(@RequestBody FavFood favfood ) {
		foodService.update(favfood);
	}
	
}
