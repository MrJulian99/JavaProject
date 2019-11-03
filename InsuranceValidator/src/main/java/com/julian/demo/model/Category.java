package com.julian.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="category")
public class Category {

	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
	private Long id;
	private String name;
	
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

	//Many categories can be connected to one user.
	@ManyToOne(cascade=CascadeType.PERSIST)//Whatever happens on the left table happens on the right table.Si existe por lo menos un usuario existiran categorias y no hay categorias sin usuarios. 
	private Set<User> user;

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}
	
	
}
