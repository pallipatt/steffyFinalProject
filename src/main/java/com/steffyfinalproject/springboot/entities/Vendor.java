package com.steffyfinalproject.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * Table  contains all information about vendors 
 *
 */
@Entity
@Table(name = "vendor")
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vendor_id")
	private Integer vendor_id;
	@Column(name = "name")
	private String name;
	
	/**
	 * @return the id
	 */
	
	public Integer getId() {
		return vendor_id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer vendor_id) {
		this.vendor_id = vendor_id;
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
