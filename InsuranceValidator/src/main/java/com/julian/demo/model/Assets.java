package com.julian.demo.model;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="assets")
public class Assets {

	
	@Id
	private Long id;
	
	private Instant  issurance_quoteDate;
	
	private String description;
	
	
	  @ManyToOne//Varios bienes pueden estar registrados de una misma categoria.
	  private Category category;
	  
	  @ManyToOne//Varios bienes pueden ser de un solo usuario. 
	  private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getIssurance_quoteDate() {
		return issurance_quoteDate;
	}

	public void setIssurance_quoteDate(Instant issurance_quoteDate) {
		this.issurance_quoteDate = issurance_quoteDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	 
	 
	
	
	//@CLASE_TO_VARIABLETYPE
	
	
	/*
	 * @OneToMany private User user;
	 * 
	 * @OneToMany private Category category;
	 */
	
	
	
	
	
}
