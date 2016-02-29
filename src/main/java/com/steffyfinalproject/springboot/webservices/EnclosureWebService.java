package com.steffyfinalproject.springboot.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.steffyfinalproject.springboot.entities.Condition;
import com.steffyfinalproject.springboot.entities.Enclosure;
import com.steffyfinalproject.springboot.services.EnclosureService;

@RestController
public class EnclosureWebService {

	@Autowired
	EnclosureService enclosureService;
	
	public void setEnclosureService(EnclosureService enclosureService) {
		this.enclosureService = enclosureService;
	}

	/**
	 * Retrieve all Condition
	 * 
	 * @return
	 */
	@RequestMapping(value = "/enclosure/condition", method = RequestMethod.GET)
	public List<Condition> getAllEnclosure() {
		return enclosureService.getCondition();
	}
	/**
	 * Web service to Creates Enclosure
	 */
	@RequestMapping(value = "/enclosure/addEnclosure", method = RequestMethod.POST)
	public void createEnclosure(@RequestBody Enclosure enclosure) {
		enclosureService.addEnclosure(enclosure);
	}
	/**
	 * Web service to get details about all Enclosure
	 */
	@RequestMapping(value = "/enclosure/enclosure", method = RequestMethod.GET)
	public List<Enclosure> getEncosureDetails() {
		return enclosureService.getAllEnclosure();
	}
	/**
	 * WebService to retrieve all information about Enclosure with corresponding
	 * ID
	 */
	@RequestMapping(value = "/enclosure/id/{id}", method = RequestMethod.GET)
	public Enclosure getFoodById(@PathVariable Integer id) {
		return enclosureService.getEnclosureId(id);
	}
	/**
	 * WebService to update enclosure with corresponding ID
	 */
	@RequestMapping(value = "/enclosure/updateEnclosure", method = RequestMethod.PUT)
	public void putEnclosure(@RequestBody Enclosure enclosure) {
		enclosureService.update(enclosure);
	}
/**
 * delete enclosure
 * @param id
 */
	@RequestMapping(value = "/enclosure/deleteEnclosure/{id}", method = RequestMethod.PUT)
	public void deleteEnclosure(@PathVariable Integer id) {
		enclosureService.delete(id);
	}
	
}
