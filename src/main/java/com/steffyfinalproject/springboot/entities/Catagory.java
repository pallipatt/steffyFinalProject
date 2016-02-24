package com.steffyfinalproject.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catagory")
public class Catagory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "catagory_id")
	private Integer catagory_id;
	
	@Column(name = "name")
	private String name;

	/**
	 * @return the catagory_id
	 */
	public Integer getCatagory_id() {
		return catagory_id;
	}

	/**
	 * @param catagory_id the catagory_id to set
	 */
	public void setCatagory_id(Integer catagory_id) {
		this.catagory_id = catagory_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
