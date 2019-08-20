package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ingredient {

	public Integer getCheese() {
		return cheese;
	}

	public void setCheese(Integer cheese) {
		this.cheese = cheese;
	}

	public Integer getSalad() {
		return salad;
	}

	public void setSalad(Integer salad) {
		this.salad = salad;
	}

	public Integer getBacon() {
		return bacon;
	}

	public void setBacon(Integer bacon) {
		this.bacon = bacon;
	}

	@Column(name="cheese")
	Integer cheese;
	
	@Column(name="salad")
	Integer salad;
	
	@Column(name="bacon")
	Integer bacon;
	
}
