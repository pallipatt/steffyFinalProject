package com.steffyfinalproject.springboot.services;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import com.steffyfinalproject.springboot.dao.FoodDao;
import com.steffyfinalproject.springboot.entities.Vendor;

public class FoodServiceTest {

	private FoodService foodService;
	private FoodDao foodDao;
//	private List<Vendor> vendors;
	
	@Before
	public void setup(){		
		foodService = new FoodService();
		foodDao =	mock(FoodDao.class);	
	}
	
	@Test
	public void getVendorsTest(){
		
		/*vendors = mock(List.class);*/
		List<Vendor> vendors = new ArrayList<Vendor>();
		when(foodDao.getAllVendors()).thenReturn(vendors);
		foodDao.getAllVendors();
		verify(foodDao, times(1)).getAllVendors();
		
	}
}
