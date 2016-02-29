package com.steffyfinalproject.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import com.steffyfinalproject.springboot.entities.Condition;
import com.steffyfinalproject.springboot.entities.Enclosure;

@Transactional
@Component
public class EnclosureDao {

	@PersistenceContext
	private EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	/**
	 * Function to return all Conditions
	 * 
	 * @return
	 */
	public List<Condition> getAllCondition() {

		return em.createQuery("SELECT c FROM Condition c", Condition.class).getResultList();
	}

	/**
	 * Function to add
	 */
	public void add(Enclosure enclosure) {
		em.flush();
		em.persist(enclosure);
	}

	/**
	 * Function to retrieve all enclosure details
	 */
	public List<Enclosure> getEnclosureDetails() {
		return em.createQuery("SELECT c FROM Enclosure c", Enclosure.class).getResultList();
	}

	/**
	 * Function to retrieve details with corresponding ID
	 */
	public Enclosure getEnclosureByID(Integer id) {
		return em.createQuery("SELECT f FROM Enclosure f WHERE f.id = :id", Enclosure.class).setParameter("id", id)
				.getSingleResult();

	}

	/**
	 * Function to update
	 */
	public void update(Enclosure enclosure) {
		em.merge(enclosure);
		em.flush();
	}

	public void delete(Integer id) {
		Enclosure e = getEnclosureByID(id);
		em.remove(e);
	}

}
