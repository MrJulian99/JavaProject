package com.julian.demo.model;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name="assets")
@NoArgsConstructor
public class Assets {

	
	@Id
	private Long id;
	
	private Instant  issurance_quoteDate;
	
	private String description;
	
	@ManyToOne//Un usuario puede tener varios bienes. 
	private Set<User> userId;
	@ManyToOne//Una categoria puede estar registrada en varios bienes.Muchos bienes pueden estar registrados de una misma  categoria.
	private Set<Category> categoryId;
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
	public Set<User> getUserId() {
		return userId;
	}
	public void setUserId(Set<User> userId) {
		this.userId = userId;
	}
	public Set<Category> getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Set<Category> categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
