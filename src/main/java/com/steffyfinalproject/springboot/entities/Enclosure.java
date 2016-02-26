package com.steffyfinalproject.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enclosure")
public class Enclosure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enclosureid")
	private Integer enclosureid;
	
	@Column(name = "name", nullable=false)
	private String name;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="animalid", nullable=false)
	private Animal animal;

	@Column(name = "count" )
	private Integer count;
	
	@Column(name = "condition" )
	private String condition;
	
	@Column(name = "time" )
	private java.sql.Time time;

}
