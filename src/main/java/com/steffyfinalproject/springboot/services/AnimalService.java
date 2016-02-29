package com.steffyfinalproject.springboot.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.steffyfinalproject.springboot.dao.AnimalDao;
import com.steffyfinalproject.springboot.entities.Animal;

@Service
public class AnimalService {

	public String chars = "[a-zA-z\\s]*";
	public String url = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

	@Autowired
	AnimalDao animalDao;

	public void setFoodDao(AnimalDao animalDao) {
		this.animalDao = animalDao;
	}

	/**
	 * validation before entering to database
	 * 
	 * @param animal
	 * @return
	 */
	public Boolean validation(Animal animal) {

		String cname = animal.getCname();
		String sname = animal.getSname();
		String url = animal.getLink();

		if (cname.matches(chars) && sname.matches(chars) && url.matches(url)) {
			System.out.println("sucess");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Add new Animal details
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {

		boolean val = validation(animal);

		if (val) {
			animalDao.add(animal);
		}
	}

	/**
	 * Get all Animal details
	 * 
	 * @return
	 */
	public List<Animal> getAllAnimalDetails() {

		return animalDao.getAnimalDetails();
	}

	/**
	 * get one animal details with with ID
	 * 
	 * @param animalid
	 * @return
	 */
	public Animal getAnimaldetailsById(Integer animalid) {
		return animalDao.getAnimalByID(animalid);
	}

	/**
	 * update animal details
	 * 
	 * @param animal
	 */
	public void update(Animal animal) {

		boolean val = validation(animal);

		if (val) {
			animalDao.updateAnimal(animal);
		}

	}

}
