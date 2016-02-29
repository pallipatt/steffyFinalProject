package com.steffyfinalproject.springboot.webservices;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.steffyfinalproject.springboot.entities.Catagory;
import com.steffyfinalproject.springboot.entities.FavFood;
import com.steffyfinalproject.springboot.entities.Vendor;
import com.steffyfinalproject.springboot.services.FoodService;

public class FoodWebServicesTest {

	private FoodService mockFoodService;

	@Before
	public void setup() {
		mockFoodService = mock(FoodService.class);
	}

	@Test
	public void getvendorsTest() {
		List<Vendor> vendors = new ArrayList<Vendor>();
		when(mockFoodService.getVendors()).thenReturn(vendors);
		mockFoodService.getVendors();
		verify(mockFoodService).getVendors();
	}

	@Test
	public void getCatagoriesTest() {
		List<Catagory> catagory = new ArrayList<Catagory>();
		when(mockFoodService.getCategory()).thenReturn(catagory);
		mockFoodService.getCategory();
		verify(mockFoodService).getCategory();
	}

	@Test
	public void createFoodTest() {

	}

	@Test
	public void getfavFoodDetailsTest() {
		List<FavFood> favfood = new ArrayList<FavFood>();
		when(mockFoodService.getAllFavFood()).thenReturn(favfood);
		mockFoodService.getAllFavFood();
		verify(mockFoodService).getAllFavFood();
	}
	
	@Test
	public void getFoodByIdTest() {

	}
	@Test
	public void putfoodTest() {

	}
	
}
