package com.steffyfinalproject.springboot.webservices;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.steffyfinalproject.springboot.entities.Animal;
import com.steffyfinalproject.springboot.services.AnimalService;

public class AnimalWebServiceTest {

	private AnimalService mockService;
	private AnimalWebService mockWebService;
	
	@Before
	public void setup() {
		mockService = mock(AnimalService.class);
		mockWebService = new AnimalWebService();
		mockWebService.setAnimalService(mockService);
	}

//	@Test
//	public void getAllEnclosureTest() {
//		List<Enclosure> e = new ArrayList<Enclosure>();
//		when(mockService.getAllEnclosure()).thenReturn(e);
//		mockService.getAllEnclosure();
//		verify(mockService).getAllEnclosure();
//	}
//
//	@Test
//	public void getEnclosureDetailsTest() {
//		List<Enclosure> e = new ArrayList<Enclosure>();
//		when(mockService.getAllEnclosure()).thenReturn(e);
//		mockService.getAllEnclosure();
//		verify(mockService).getAllEnclosure();
//	}

	@Test
	public void createTest() {
		mockWebService.createAnimal(null);
		verify(mockService, times(1)).addAnimal(null);
	}

	@Test
	public void getAnimalDetailsTest() {
		List<Animal> e = new ArrayList<Animal>();
		when(mockService.getAllAnimalDetails()).thenReturn(e);
		mockWebService.getAnimalDetails();
	//	mockService.getAllAnimalDetails();
		verify(mockService).getAllAnimalDetails();
	}
	
	@Test
	public void getAnimalIdTest() {
		mockWebService.getAnimalById(null);
		verify(mockService, times(1)).getAnimaldetailsById(null);
	}
	@Test
	public void putTest() {
		mockWebService.putAnimal(null);
		verify(mockService, times(1)).update(null);
	}

}
