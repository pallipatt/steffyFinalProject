package com.steffyfinalproject.springboot.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.steffyfinalproject.springboot.dao.FoodDao;
import com.steffyfinalproject.springboot.entities.Catagory;
import com.steffyfinalproject.springboot.entities.FavFood;
import com.steffyfinalproject.springboot.entities.Vendor;

public class FoodServiceTest {

	private FoodService foodService;
	private FoodDao foodDao;
	private FavFood mockfavfood;

	@Before
	public void setup() {
		foodService = new FoodService();
		foodDao = mock(FoodDao.class);
		foodService.setFoodDao(foodDao);
	}

	@Test
	public void getVendorsTest() {
		List<Vendor> vendors = new ArrayList<Vendor>();
		when(foodDao.getAllVendors()).thenReturn(vendors);
		foodDao.getAllVendors();
		verify(foodDao, times(1)).getAllVendors();

	}

	@Test
	public void getCategoryTest() {
		List<Catagory> catagory = new ArrayList<Catagory>();
		when(foodDao.getAllCategory()).thenReturn(catagory);
		foodDao.getAllCategory();
		verify(foodDao, times(1)).getAllCategory();
	}

	@Test
	public void getAllFavFoodTest() {
		List<FavFood> favfood = new ArrayList<FavFood>();
		when(foodDao.getFavFoodDetails()).thenReturn(favfood);
		foodDao.getFavFoodDetails();
		verify(foodDao, times(1)).getFavFoodDetails();
	}

/*	@Test
	public void validationTest() {
		
		
//		FavFood mockfavfood = mock(FavFood.class);
//	//	String mockString = mock(String.class);
//		//String mockRegex = mock(String.class);
//		
//		when(mockfavfood.getName()).thenReturn("abc");
//		when(mockString.matches("abc")).thenReturn(true);
	}
	*/
	@Test
	public void addFoodSucessTest() {

		FavFood mockfavfood = mock(FavFood.class);
		
		when(mockfavfood.getName()).thenReturn("abc");	
		Boolean isSucess = foodService.validation(mockfavfood);
		assertTrue( isSucess);
		
		foodDao.add(mockfavfood);
		verify(foodDao,times(1)).add(mockfavfood);
	
	}
	
	@Test
	public void addFoodFailTest() {
		FavFood mockfavfood = mock(FavFood.class);
		
		when(mockfavfood.getName()).thenReturn("!@@dfg");	
		Boolean isSucess = foodService.validation(mockfavfood);
		assertFalse( isSucess);
	
	}

	@Test
	public void getFoodByIdTest() {
		
		foodService.getFoodById(null);
		verify(foodDao, times(1)).getFavFoodByID(null);
	}

	@Test
	public void updateTest() {

	}

}
