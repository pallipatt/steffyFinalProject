package com.steffyfinalproject.springboot.services;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.steffyfinalproject.springboot.dao.AnimalDao;
import com.steffyfinalproject.springboot.entities.Animal;

public class AnimalServiceTest {

	private AnimalService service;
	private AnimalDao dao;
	//private FavFood mockfavfood;
	
	@Before
	public void setup() {
		service = new AnimalService();
		dao = mock(AnimalDao.class);
		service.setFoodDao(dao);
	}

	@Test
	public void getAllAnimalTest() {
		List<Animal> animal = new ArrayList<Animal>();
		when(dao.getAnimalDetails()).thenReturn(animal);
		dao.getAnimalDetails();
		verify(dao, times(1)).getAnimalDetails();

	}


	@Test
	public void validationTest() {

	}
	
	@Test
	public void addFoodTest() {
		
		
	}

	@Test
	public void getAnimalDetailsByIdTest() {
		
		service.getAnimaldetailsById(null);
		verify(dao, times(1)).getAnimalByID(null);
	}

	@Test
	public void updateTest() {

	}

}
