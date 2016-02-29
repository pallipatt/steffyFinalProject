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
import com.steffyfinalproject.springboot.entities.Animal;

public class AnimalDaoTest {
	private AnimalDao animalDao;
	private EntityManager mockEm;

	@Before
	public void setup() {
		
		animalDao = new AnimalDao();
		mockEm = mock(EntityManager.class);
		animalDao.setEm(mockEm);
		
	}

	@Test
	public void getAnimalDetailsTest() {

		@SuppressWarnings("unchecked")
		TypedQuery<Animal> mockTypedQuery = mock(TypedQuery.class);

		List<Animal> expected = new ArrayList<Animal>();

		when(mockEm.createQuery(anyString(), eq(Animal.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.getResultList()).thenReturn(expected);

		animalDao.getAnimalDetails();
		verify(mockTypedQuery).getResultList();

	}

	
	@Test
	public void getAnimalByIDTest(){
		
		@SuppressWarnings("unchecked")
		TypedQuery<Animal> mockTypedQuery = mock(TypedQuery.class);
		Animal expected = new Animal();
		
		when(mockEm.createQuery(anyString(), eq(Animal.class))).thenReturn(mockTypedQuery);
		when(mockTypedQuery.setParameter(anyString(), anyInt())).thenReturn(mockTypedQuery);

		when(mockTypedQuery.getSingleResult()).thenReturn(expected);
		animalDao.getAnimalByID(1);
		verify(mockTypedQuery).setParameter(eq("animalid"), eq(1));
		
	}
	
	@Test
	public void addTest(){
		animalDao.add(null);
		verify(mockEm).persist(null);
	}
	
	@Test
	public void updateAnimalTest(){
		animalDao.updateAnimal(null);
		verify(mockEm).merge(null);
	}
}
