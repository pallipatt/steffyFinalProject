package com.steffyfinalproject.springboot.webservices;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.steffyfinalproject.springboot.entities.Enclosure;
import com.steffyfinalproject.springboot.services.ScheduleService;

public class ScheduleWebServiceTest {

		private ScheduleService mockService;
	private ScheduleWebService mockWebService;
	
	@Before
	public void setup() {
		mockService = mock(ScheduleService.class);
		mockWebService = new ScheduleWebService();
		mockWebService.setFoodService(mockService);
	}

	@Test
	public void getAllScheduleTest() {
		List<Enclosure> e = new ArrayList<Enclosure>();
		when(mockService.getschedule()).thenReturn(e);
		mockService.getschedule();
		verify(mockService).getschedule();
	}
}
