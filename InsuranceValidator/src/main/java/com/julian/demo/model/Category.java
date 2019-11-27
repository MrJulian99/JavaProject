package com.julian.demo.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;



@Entity
@NoArgsConstructor
@Data
@Table(name="category")
public class Category {


	@Id
	private Long id;
	//Auto, House, ...
	
	@NonNull
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
	//Whatever happens on the left table happens on the right table.Si existe por lo menos un usuario existiran categorias y no hay categorias sin usuarios: 
	
	
	
	/*
	 * @ManyToOne(cascade=CascadeType.PERSIST) private User user;
	 */
	 
	
	
}
