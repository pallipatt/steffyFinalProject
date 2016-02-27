package com.steffyfinalproject.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;
import com.steffyfinalproject.springboot.entities.Animal;

@Transactional
@Component
public class AnimalDao {

	@PersistenceContext
	private EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	/**
	 * Function to add Animal Details
	 */
	public void add(Animal animal) {
		em.flush();
		em.persist(animal);

	}

	/**
	 * Function to get all Animal Details
	 */
	public List<Animal> getAnimaldetails() {
		return em.createQuery("SELECT a FROM Animal a", Animal.class).getResultList();
	}
	/**
	 * Function to retrieve Animal details with corresponding ID
	 */
	public  Animal getAnimalByID(Integer animalid) {
		return  em.createQuery("SELECT f FROM Animal f WHERE f.animalid = :animalid", Animal.class)
				.setParameter("animalid", animalid).getSingleResult();
	}

	public void updateAnimal(Animal animal) {
		em.merge(animal);
		em.flush();
		
	}
}
