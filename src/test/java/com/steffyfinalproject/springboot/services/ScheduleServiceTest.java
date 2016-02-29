
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
import com.steffyfinalproject.springboot.dao.ScheduleDao;
import com.steffyfinalproject.springboot.entities.Catagory;
import com.steffyfinalproject.springboot.entities.Enclosure;
import com.steffyfinalproject.springboot.entities.FavFood;
import com.steffyfinalproject.springboot.entities.Vendor;

public class ScheduleServiceTest {

	private ScheduleService service;
	private ScheduleDao dao;
//	private FavFood mockfavfood;

	@Before
	public void setup() {
		service = new ScheduleService();
		dao = mock(ScheduleDao.class);
		service.setFoodDao(dao);
	}


	@Test
	public void getCategoryTest() {
		List<Enclosure> catagory = new ArrayList<Enclosure>();
		when(dao.getAllSchedule()).thenReturn(catagory);
		dao.getAllSchedule();
		verify(dao, times(1)).getAllSchedule();
	}

}