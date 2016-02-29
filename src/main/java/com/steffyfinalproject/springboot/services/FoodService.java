package com.steffyfinalproject.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.steffyfinalproject.springboot.dao.FoodDao;
import com.steffyfinalproject.springboot.entities.Catagory;
import com.steffyfinalproject.springboot.entities.FavFood;
import com.steffyfinalproject.springboot.entities.Vendor;

/**
 * Contains info about all Food Services
 *
 */
@Service
public class FoodService {

	private String regexp = "[a-zA-z\\s]*";

	@Autowired
	FoodDao foodDao;

	public void setFoodDao(FoodDao foodDao) {
		this.foodDao = foodDao;
	}

	/**
	 * validation before entering to database
	 * 
	 * @param animal
	 * @return
	 */
	public Boolean validation(FavFood favFood) {

		String name = favFood.getName();

		if (name.matches(regexp)) {
			System.out.println("sucess");
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Service to add favorite food
	 * 
	 * @throws Exception
	 */
	public void addFood(FavFood favfood) {

		Boolean result = validation(favfood);

		if (result) {
			foodDao.add(favfood);
		}

	}
	/**
	 * Service to retrieve all vendors
	 */
	public List<Vendor> getVendors() {
		return foodDao.getAllVendors();
	}

	/**
	 * Service to retrieve all categories
	 */
	public List<Catagory> getCategory() {
		return foodDao.getAllCategory();
	}

	/**
	 * Service to get details about all favorite food
	 */
	public List<FavFood> getAllFavFood() {
		return foodDao.getFavFoodDetails();
	}

	/**
	 * Service to get details about favorite food with corresponding ID
	 */
	public FavFood getFoodById(Integer foodId) {
		return foodDao.getFavFoodByID(foodId);
	}

	/**
	 * Service to update details about favorite food
	 * 
	 * @throws Exception
	 */
	public void update(FavFood favfood) {

		Boolean result = validation(favfood);

		if (result) {
			foodDao.updateFood(favfood);
		}

	}
}
