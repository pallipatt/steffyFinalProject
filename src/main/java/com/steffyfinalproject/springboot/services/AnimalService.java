package com.steffyfinalproject.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steffyfinalproject.springboot.dao.AnimalDao;
import com.steffyfinalproject.springboot.entities.Animal;

@Service
public class AnimalService {

	@Autowired
	AnimalDao animalDao;

	public void setFoodDao(AnimalDao animalDao) {
		
		this.animalDao = animalDao;
	}

	public void addAnimal(Animal animal) {
		animalDao.add(animal);
	}

	public List<Animal> getAllAnimalDetails() {

		return animalDao.getAnimaldetails();
	}

	public Animal getAnimaldetailsById(Integer animalid) {
		return animalDao.getAnimalByID(animalid);
	}

	public void update(Animal animal) {
		animalDao.updateAnimal(animal);
	}

}
