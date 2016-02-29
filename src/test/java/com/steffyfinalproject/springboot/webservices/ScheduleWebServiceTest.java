package com.steffyfinalproject.springboot.webservices;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.steffyfinalproject.springboot.entities.Enclosure;
import com.steffyfinalproject.springboot.services.EnclosureService;

public class ScheduleWebServiceTest {

	private EnclosureService mockService;
	private EnclosureWebService mockWebService;
	
	@Before
	public void setup() {
		mockService = mock(EnclosureService.class);
		mockWebService = new EnclosureWebService();
		mockWebService.setEnclosureService(mockService);
	}

	@Test
	public void getAllEnclosureTest() {
		List<Enclosure> e = new ArrayList<Enclosure>();
		when(mockService.getAllEnclosure()).thenReturn(e);
		mockService.getAllEnclosure();
		verify(mockService).getAllEnclosure();
	}

	@Test
	public void getEnclosureDetailsTest() {
		List<Enclosure> e = new ArrayList<Enclosure>();
		when(mockService.getAllEnclosure()).thenReturn(e);
		mockService.getAllEnclosure();
		verify(mockService).getAllEnclosure();
	}

	@Test
	public void createEnclosureTest() {
		mockWebService.createEnclosure(null);
		verify(mockService, times(1)).addEnclosure(null);
	}

	@Test
	public void getEncosureDetailsTest() {
		List<Enclosure> e = new ArrayList<Enclosure>();
		when(mockService.getAllEnclosure()).thenReturn(e);
		mockService.getAllEnclosure();
		verify(mockService).getAllEnclosure();
	}
	
	@Test
	public void getEnclosureIdTest() {
		mockWebService.getFoodById(null);
		verify(mockService, times(1)).getEnclosureId(null);
	}
	@Test
	public void putEnclosureTest() {
		mockWebService.putEnclosure(null);
		verify(mockService, times(1)).update(null);
	}
	@Test
	public void deleteEnclosureTest() {
		mockWebService.deleteEnclosure(null);
		verify(mockService, times(1)).delete(null);
	}
}
