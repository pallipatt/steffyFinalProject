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

	@Autowired
	FoodDao foodDao;

	public void setFoodDao(FoodDao foodDao) {
		this.foodDao = foodDao;
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
	 * Service to add favorite food
	 */
	public void addFood(FavFood favfood) {
		foodDao.add(favfood);
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
	 */
	public void update(FavFood favfood) {
		foodDao.updateFood(favfood);
	}
}
