package com.julian.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julian.demo.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	Category findByName(String name);
	
	
}
