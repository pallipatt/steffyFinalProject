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


@Entity (name = "fav_food")
public class FavFood {

	private Integer fav_food_id;
	private String name;
	private Vendor vendor;
	private Catagory catagory;
	/**
	 * @return the fav_food_id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getFav_food_id() {
		return fav_food_id;
	}
	/**
	 * @param fav_food_id the fav_food_id to set
	 */
	public void setFav_food_id(Integer fav_food_id) {
		this.fav_food_id = fav_food_id;
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
	/**
	 * @return the vendor
	 */
	@ManyToOne(optional = false)
	@JoinColumn(name="vendor_id", nullable=false)
	public Vendor getVendor() {
		return vendor;
	}
	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	/**
	 * @return the category
	 */
	@ManyToOne(optional = false)
	@JoinColumn(name="catagory_id")
	public Catagory getCatagory() {
		return catagory;
	}
	/**
	 * @param catagory the catagory to set
	 */
	public void setCatagory(Catagory category) {
		this.catagory = category;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder(31, 17);
		builder.append(fav_food_id);
		return builder.toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof FavFood)){
			return false;
		}
		FavFood lineItem = (FavFood) obj;
 
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.fav_food_id, lineItem.fav_food_id);
		return builder.isEquals();
		
	}
	
}
