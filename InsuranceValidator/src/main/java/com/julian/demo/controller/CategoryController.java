package com.julian.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julian.demo.model.Category;
import com.julian.demo.repository.CategoryRepository;


@RestController
@RequestMapping("/api")
public class CategoryController {
		private CategoryRepository categoryRepository;

		public CategoryController(CategoryRepository categoryRepository) {
			super();
			this.categoryRepository = categoryRepository;
		}
		
		@GetMapping("/categories")
		Collection<Category> categories(){
			
			return categoryRepository.findAll();
			
		}
		
		@GetMapping("/category/{id}")
		ResponseEntity<?> getCategory(@PathVariable Long id){
			//Puede que no sea un category lo que retorna.Ejm si no exite ese id. 
			Optional<Category> category = categoryRepository.findById(id);
			return category.map(response -> ResponseEntity.ok().body(response))
					.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
		//Mapeamos la respuesta de category a response y luego si ese responseEntity esta ok() entonces colocamos el response  adentro del body del responseentity. 
		//response es una funcion 
		//Lambda expression
		}
		
		@PostMapping("/category")
		ResponseEntity<Category> createCategory(@Valid @RequestBody Category category) throws URISyntaxException{
			Category result = categoryRepository.save(category);
			//This replaces the sql.... jpa help us with this
			return ResponseEntity.created(new URI("/api/category" + result.getId())).body(result);
		}
		
		@PutMapping("/category/{id}")
		ResponseEntity<Category> updateCategory(@Valid @RequestBody Category category) throws URISyntaxException{
			
			Category result =categoryRepository.save(category);
			return ResponseEntity.ok().body(result);
		}
		
		@DeleteMapping ("/category/{id}")
		ResponseEntity<?> deleteCategory(@PathVariable Long id){
			categoryRepository.deleteById(id);
			return ResponseEntity.ok().build();
			
		}
		
}
