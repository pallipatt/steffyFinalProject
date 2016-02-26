package com.steffyfinalproject.springboot.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.steffyfinalproject.springboot.entities.Animal;
import com.steffyfinalproject.springboot.services.AnimalService;

@RestController
public class AnimalWebService {

	@Autowired
	AnimalService animalService;

	public void setAnimalService(AnimalService animalservice) {
		this.animalService = animalservice;
	}

	/**
	 * Web service to Creates Animal Details
	 */
	@RequestMapping(value = "/animal/createanimal", method = RequestMethod.POST)
	public void createAnimal(@RequestBody Animal animal) {
		animalService.addAnimal(animal);
	}

	/**
	 * Web service to get details about animals
	 */
	@RequestMapping(value = "/animal/animals", method = RequestMethod.GET)
	public List<Animal> getAnimalDetails() {
		return animalService.getAllAnimalDetails();
	}

	/**
	 * WebService to retrieve all information about fav Food with corresponding
	 * ID
	 */
	@RequestMapping(value = "/animal/id/{animalid}", method = RequestMethod.GET)
	public Animal getAnimalById(@PathVariable Integer animalid) {
		return animalService.getAnimaldetailsById(animalid);
	}

	/**
	 * WebService to update fav Food with corresponding ID
	 */
	@RequestMapping(value = "/animal/updateanimal", method = RequestMethod.PUT)
	public void putAnimal(@RequestBody Animal animal) {
		animalService.update(animal);
	}
}
