package com.steffyfinalproject.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * Table  contains all information about Condition 
 *
 */
@Entity
@Table(name = "condition")
public class Condition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "conditionid")
	private Integer conditionid;
	
	@Column(name = "name")
	private String name;
	
	/**
	 * @return the id
	 */
	
	public Integer getId() {
		return conditionid;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer conditionid) {
		this.conditionid = conditionid;
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
