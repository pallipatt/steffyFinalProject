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
@Table(name = "animal")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "animalid")
	private Integer animalid;
	
	@Column(name = "cname", nullable=false)
	private String cname;
	
	@Column(name = "csname" , nullable=false)
	private String sname;

	@Column(name = "link", nullable=false)
	private String link;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="favfoodid", nullable=false)
	private FavFood favfood;

	public Integer getAnimalid() {
		return animalid;
	}

	public void setAnimalid(Integer animalid) {
		this.animalid = animalid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public FavFood getFavfood() {
		return favfood;
	}

	public void setFavfood(FavFood favfood) {
		this.favfood = favfood;
	}
	
	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder(31, 17);
		builder.append(animalid);
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Animal)) {
			return false;
		}
		Animal a = (Animal) obj;

		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.animalid, a.animalid);
		return builder.isEquals();

	}
	
}
