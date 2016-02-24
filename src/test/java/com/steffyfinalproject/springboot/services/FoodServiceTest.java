package com.steffyfinalproject.springboot.services;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.steffyfinalproject.springboot.dao.FoodDao;
import com.steffyfinalproject.springboot.entities.Vendor;


public class FoodServiceTest {

	private FoodService foodService;
	private FoodDao foodDao;
	
	@Before
	public void setup(){
		
		foodService = new FoodService();
		foodDao = new FoodDao();
		
	}
	// to check 
	@Test
	public void getVendorsTest(){
		
		@SuppressWarnings("unchecked")
		List<Vendor> vendors = mock(List.class);
	
		when(foodDao.getAllVendors()).thenReturn(vendors);
		foodService.getVendors();
		verify(foodDao).getAllVendors();
		
	}
}
