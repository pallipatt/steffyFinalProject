package com.steffyfinalproject.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

	@Column(name = "count", nullable=false)
	private Integer count;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "conditionid" , nullable=false)
	private Condition condition;
	
//	@Column(name = "time", nullable=false )
//	private java.sql.Time time;
	
	@Column(name = "time", nullable=false )
	private java.util.Date time;
	
	public Integer getEnclosureid() {
		return enclosureid;
	}

	public void setEnclosureid(Integer enclosureid) {
		this.enclosureid = enclosureid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

//	public java.sql.Time getTime() {
//		return time;
//	}
//
//	public void setTime(java.sql.Time time) {
//		this.time = time;
//	}
	public java.util.Date getTime() {
		return time;
	}

	public void setTime(java.util.Date time) {
		this.time = time;
	}


	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder(31, 17);
		builder.append(enclosureid);
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FavFood)) {
			return false;
		}
		Enclosure enclosure = (Enclosure) obj;

		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.enclosureid, enclosure.enclosureid);
		return builder.isEquals();

	}

	
}
