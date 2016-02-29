package com.steffyfinalproject.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import com.steffyfinalproject.springboot.entities.Enclosure;

@Transactional
@Component
public class ScheduleDao {

	@PersistenceContext
	private EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public List<Enclosure> getAllSchedule() {
    return em.createQuery("SELECT r FROM Enclosure r ORDER BY time ASC", Enclosure.class)
			.getResultList();
	}
}
