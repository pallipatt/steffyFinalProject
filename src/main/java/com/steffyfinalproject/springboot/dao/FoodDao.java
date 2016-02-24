package com.steffyfinalproject.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.steffyfinalproject.springboot.entities.Catagory;
import com.steffyfinalproject.springboot.entities.FavFood;
import com.steffyfinalproject.springboot.entities.Vendor;

@Transactional
@Component
public class FoodDao {

	@PersistenceContext
	private EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	/**
	 * Function to return all Food Vendors From vendor
	 * 
	 * @return
	 */
	public List<Vendor> getAllVendors() {
		return em.createQuery("SELECT c FROM Vendor c", Vendor.class).getResultList();
	}

	/**
	 * Function to return all Food Categories From Category
	 * 
	 * @return
	 */
	public List<Catagory> getAllCategory() {

		return em.createQuery("SELECT c FROM Catagory c", Catagory.class).getResultList();
	}

	/**
	 * Function to add favorite food
	 */
	public void add(FavFood favfood) {
		System.out.println("inside FoodDao ");
		em.flush();
		em.persist(favfood);

	}

	/**
	 * Function to retrieve all favorite food details
	 */
	public List<FavFood> getFavFoodDetails() {
		// System.out.println("-------------------------->inside FoodDao ");
		return em.createQuery("SELECT c FROM FavFood c", FavFood.class).getResultList();
	}

	/**
	 * Function to retrieve favorite food details with corresponding ID
	 */
	public FavFood getFavFoodByID(Integer favfoodid) {
		return em.createQuery("SELECT f FROM FavFood f WHERE f.favfoodid = :favfoodid", FavFood.class)
				.setParameter("favfoodid", favfoodid).getSingleResult();
	}
}
