package com.julian.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity //Asi JPA sabe que mi intencion es construir una tabla con este modelo "Usuario"
@Table(name="user")
public class User {
	
	public User(Long id, String name, String email) {
		super();
		
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	@Id
	private Long id;
	private String name;
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@OneToMany //One user can have many categories.
	private  Set<Category> category;//Set eliminates the duplicates.Se puede usar un Array pero el Set no guarda duplicados. 

	public Set<Category> getCategory() {
		return category;
	}
	public void setCategory(Set<Category> category) {
		this.category = category;
	}
	
}
