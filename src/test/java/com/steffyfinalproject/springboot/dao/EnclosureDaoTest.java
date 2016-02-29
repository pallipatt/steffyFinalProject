package com.steffyfinalproject.springboot.dao;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Before;
import org.junit.Test;

import com.steffyfinalproject.springboot.entities.Condition;
import com.steffyfinalproject.springboot.entities.Enclosure;

public class EnclosureDaoTest {

	private EnclosureDao dao;
	private EntityManager mockEm;

	@Before
	public void setup() {
		
		dao = new EnclosureDao();
		mockEm = mock(EntityManager.class);
		dao.setEm(mockEm);
		
	}

	@Test
	public void getAllConditionTest() {

		@SuppressWarnings("unchecked")
		TypedQuery<Condition> mockTypedQuery = mock(TypedQuery.class);

		List<Condition> expected = new ArrayList<Condition>();

		when(mockEm.createQuery(anyString(), eq(Condition.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getResultList()).thenReturn(expected);

		dao.getAllCondition();
		verify(mockTypedQuery).getResultList();

	}
	
	
	@Test
	public void getEnclosureDetailsTest() {

		@SuppressWarnings("unchecked")
		TypedQuery<Enclosure> mockTypedQuery = mock(TypedQuery.class);

		List<Enclosure> expected = new ArrayList<Enclosure>();

		when(mockEm.createQuery(anyString(), eq(Enclosure.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getResultList()).thenReturn(expected);

		dao.getEnclosureDetails();
		verify(mockTypedQuery).getResultList();

	}
	
	@Test
	public void getEnclosureByIDTest(){
		
		@SuppressWarnings("unchecked")
		TypedQuery<Enclosure> mockTypedQuery = mock(TypedQuery.class);
		Enclosure expected = new Enclosure();
		
		when(mockEm.createQuery(anyString(), eq(Enclosure.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.setParameter(anyString(), anyInt())).thenReturn(mockTypedQuery);

		when(mockTypedQuery.getSingleResult()).thenReturn(expected);
		dao.getEnclosureByID(1);
		verify(mockTypedQuery).setParameter(eq("id"), eq(1));
		
	}
	
	@Test
	public void addTest(){
		dao.add(null);
		verify(mockEm).persist(null);
	}
	
	@Test
	public void updateTest(){
		dao.update(null);
		verify(mockEm).merge(null);
	}
	
	@Test
	public void deleteTest(){
		@SuppressWarnings("unchecked")
		TypedQuery<Enclosure> mockTypedQuery = mock(TypedQuery.class);
		
		Enclosure enclosure = new Enclosure();
		enclosure.setEnclosureid(1);
		


		when(mockEm.createQuery(anyString(), eq(Enclosure.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.setParameter(anyString(), anyInt())).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getSingleResult()).thenReturn(enclosure);
		
	//	target.delete(5);
		dao.delete(1);
		verify(mockEm, times(1)).remove(enclosure);
		
	}
}
