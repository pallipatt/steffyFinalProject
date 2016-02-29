package com.steffyfinalproject.springboot.services;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.steffyfinalproject.springboot.dao.EnclosureDao;
import com.steffyfinalproject.springboot.entities.Condition;
import com.steffyfinalproject.springboot.entities.Enclosure;

public class EnclosureServiceTest {

	private EnclosureService service;
	private EnclosureDao dao;
	// private FavFood mockfavfood;

	@Before
	public void setup() {
		service = new EnclosureService();
		dao = mock(EnclosureDao.class);
		service.setEnclosureDao(dao);
	}

	@Test
	public void getConditionTest() {
		List<Condition> condition = new ArrayList<Condition>();
		when(dao.getAllCondition()).thenReturn(condition);
		service.getCondition();
		verify(dao, times(1)).getAllCondition();

	}

	@Test
	public void getAllEnclosureTest() {
		List<Enclosure> enclosure = new ArrayList<Enclosure>();
		when(dao.getEnclosureDetails()).thenReturn(enclosure);
		service.getAllEnclosure();
		verify(dao, times(1)).getEnclosureDetails();

	}

	@Test
	public void validationTest() {

	}

	@Test
	public void addFoodTest() {

	}

	@Test
	public void getEnclosureByIdTest() {

		service.getEnclosureId(null);
		verify(dao, times(1)).getEnclosureByID(null);
	}

	@Test
	public void updateTest() {

	}

	@Test
	public void deleteTest() {
		service.delete(null);
		verify(dao, times(1)).delete(null);	
}
}
