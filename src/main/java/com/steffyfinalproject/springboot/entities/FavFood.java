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
@Table(name = "favfood")
public class FavFood {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "favfoodid")
	private Integer favfoodid;
	@Column(name = "name")
	private String name;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="vendor_id", nullable=false)
	private Vendor vendor;

	@ManyToOne(optional = false)
	@JoinColumn(name="catagory_id")
	private Catagory catagory;
	/**
	 * @return the fav_food_id
	 */
	public Integer getFavfoodid() {
		return favfoodid;
	}
	/**
	 * @param fav_food_id the fav_food_id to set
	 */
	public void setFavfoodid(Integer favfoodid) {
		this.favfoodid = favfoodid;
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
		builder.append(favfoodid);
		return builder.toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof FavFood)){
			return false;
		}
		FavFood lineItem = (FavFood) obj;
 
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.favfoodid, lineItem.favfoodid);
		return builder.isEquals();
		
	}
	
}
