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
		return em.createQuery("SELECT c FROM vendor c", Vendor.class).getResultList();
	}

	/**
	 * Function to return all Food Categories From Category
	 * 
	 * @return
	 */
	public List<Catagory> getAllCategory() {

		return em.createQuery("SELECT c FROM catagory c", Catagory.class).getResultList();
	}

	/**
	 * Function to add favorite food
	 */
	public void add(FavFood favfood) {
		System.out.println("inside FoodDao ");
		em.flush();
		em.persist(favfood);

	}

	public List<FavFood> getFavFoodDetails() {
		System.out.println("-------------------------->inside FoodDao ");
		return em.createQuery("SELECT c FROM fav_food c", FavFood.class).getResultList();
	}
}
