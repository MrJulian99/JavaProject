package com.julian.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="user")
@Entity //Asi JPA sabe que mi intencion es construir una tabla con este modelo "Usuario"
public class User {
	
	
	
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
	
	
	
	 //One user can have many categories. 
     //Set eliminates the duplicates.Se puede usar un Array pero el Set no guarda duplicados:
	
	
	/*
	 * @OneToMany private Set<Category> category;
	 * 
	 */
	 
	
}
