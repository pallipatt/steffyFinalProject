package com.steffyfinalproject.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steffyfinalproject.springboot.dao.EnclosureDao;
import com.steffyfinalproject.springboot.entities.Condition;
import com.steffyfinalproject.springboot.entities.Enclosure;

@Service
public class EnclosureService {

	private String charsRegex = "[a-zA-z\\s]*";
	private String numRegex = "\\d+";

@Autowired
	EnclosureDao enclosureDao;

	public void setEnclosureDao(EnclosureDao enclosureDao) {
		this.enclosureDao = enclosureDao;
	}

	/**
	 * validation before entering to database
	 * 
	 * @param animal
	 * @return
	 */
	public Boolean validation(Enclosure enclosure) {

		String name = enclosure.getName();
		Integer count = enclosure.getCount();
		if (name.matches(charsRegex) && count.toString().matches(numRegex) ) {
			System.out.println("sucess");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Service to retrieve all conditions
	 */
	public List<Condition> getCondition() {
		return enclosureDao.getAllCondition();
	}

	/**
	 * Service to add enclosure
	 */
	public void addEnclosure(Enclosure enclosure) {
		Boolean validation = validation(enclosure);
		if (validation) {
			enclosureDao.add(enclosure);
		}

	}

	/**
	 * Service to get details about all enclosure
	 */
	public List<Enclosure> getAllEnclosure() {
		return enclosureDao.getEnclosureDetails();
	}

	/**
	 * Service to get details about corresponding ID
	 */
	public Enclosure getEnclosureId(Integer id) {
		return enclosureDao.getEnclosureByID(id);
	}

	/**
	 * Service to update details
	 */
	public void update(Enclosure enclosure) {
		Boolean validation = validation(enclosure);
		if (validation) {
			enclosureDao.update(enclosure);
		}
	}

	public void delete(Integer id) {
		enclosureDao.delete(id);

	}

}
