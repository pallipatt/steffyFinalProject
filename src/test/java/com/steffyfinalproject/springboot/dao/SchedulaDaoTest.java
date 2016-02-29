package com.steffyfinalproject.springboot.dao;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;

import com.steffyfinalproject.springboot.entities.Enclosure;

public class SchedulaDaoTest {

	private ScheduleDao dao;
	private EntityManager mockEm;

	@Before
	public void setup() {
		
		dao = new ScheduleDao();
		mockEm = mock(EntityManager.class);
		dao.setEm(mockEm);
		
	}
	
	@Test
	public void getAllScheduleTest() {

		@SuppressWarnings("unchecked")
		TypedQuery<Enclosure> mockTypedQuery = mock(TypedQuery.class);

		List<Enclosure> expected = new ArrayList<Enclosure>();

		when(mockEm.createQuery(anyString(), eq(Enclosure.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getResultList()).thenReturn(expected);

		dao.getAllSchedule();
		verify(mockTypedQuery).getResultList();

	}
}
