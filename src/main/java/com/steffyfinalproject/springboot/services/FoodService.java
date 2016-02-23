package com.steffyfinalproject.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steffyfinalproject.springboot.dao.VendorDao;
import com.steffyfinalproject.springboot.entities.Vendor;


/**
 * Contains info about all Food Services
 *
 */
@Service
public class FoodService {

	@Autowired
	VendorDao vendorDao;
	
	public List<Vendor> getVendors() {
		return vendorDao.getAllVendors();
	}
}
