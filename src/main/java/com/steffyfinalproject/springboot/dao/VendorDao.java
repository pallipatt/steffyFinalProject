package com.steffyfinalproject.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.steffyfinalproject.springboot.entities.Vendor;

@Transactional
@Component
public class VendorDao {

	@PersistenceContext
	private EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}
	/**
	 * Function to return all Food Vendors From vendor 
	 * @return
	 */
	public List<Vendor> getAllVendors(){
		return em.createQuery("SELECT c FROM vendor c", Vendor.class).getResultList();
	}
}
