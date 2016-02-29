package com.steffyfinalproject.springboot.dao;

import static org.mockito.Matchers.anyInt;
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

import com.steffyfinalproject.springboot.entities.Catagory;
import com.steffyfinalproject.springboot.entities.FavFood;
import com.steffyfinalproject.springboot.entities.Vendor;

public class FoodDaoTest {

	private FoodDao foodDao;
	private EntityManager mockEm;

	@Before
	public void setup() {
		
		foodDao = new FoodDao();
		mockEm = mock(EntityManager.class);
		foodDao.setEm(mockEm);
		
	}

	@Test
	public void getAllVendorsTest() {

		@SuppressWarnings("unchecked")
		TypedQuery<Vendor> mockTypedQuery = mock(TypedQuery.class);

		List<Vendor> expected = new ArrayList<Vendor>();

		when(mockEm.createQuery(anyString(), eq(Vendor.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getResultList()).thenReturn(expected);

		foodDao.getAllVendors();
		verify(mockTypedQuery).getResultList();

	}
	
	@Test
	public void getAllCategoryTest() {

		@SuppressWarnings("unchecked")
		TypedQuery<Catagory> mockTypedQuery = mock(TypedQuery.class);

		List<Catagory> expected = new ArrayList<Catagory>();

		when(mockEm.createQuery(anyString(), eq(Catagory.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getResultList()).thenReturn(expected);

		foodDao.getAllCategory();
		verify(mockTypedQuery).getResultList();

	}
	
	@Test
	public void getFavFoodDetailsTest() {

		@SuppressWarnings("unchecked")
		TypedQuery<FavFood> mockTypedQuery = mock(TypedQuery.class);

		List<FavFood> expected = new ArrayList<FavFood>();

		when(mockEm.createQuery(anyString(), eq(FavFood.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getResultList()).thenReturn(expected);

		foodDao.getFavFoodDetails();
		verify(mockTypedQuery).getResultList();

	}
	
	@Test
	public void getFavFoodByIDTest(){
		
		@SuppressWarnings("unchecked")
		TypedQuery<FavFood> mockTypedQuery = mock(TypedQuery.class);
		FavFood expected = new FavFood();
		
		when(mockEm.createQuery(anyString(), eq(FavFood.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.setParameter(anyString(), anyInt())).thenReturn(mockTypedQuery);

		when(mockTypedQuery.getSingleResult()).thenReturn(expected);
		foodDao.getFavFoodByID(1);
		verify(mockTypedQuery).setParameter(eq("favfoodid"), eq(1));
		
	}
	
	@Test
	public void addTest(){
		foodDao.add(null);
		verify(mockEm).persist(null);
	}
	
	@Test
	public void updateTest(){
		foodDao.updateFood(null);
		verify(mockEm).merge(null);
	}
}
