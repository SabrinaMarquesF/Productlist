package com.devsuperior.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.entities.Departaments;
import com.devsuperior.demo.entities.Products;

@RestController
@RequestMapping(value= "/products")
public class ProductsController {
	
	@GetMapping
	public List<Products> getObjects() {
		Departaments d1 = new Departaments(1L, "Tech");
		Departaments d2 = new Departaments(2L, "Pet");
		
		Products p1 = new Products(1L, "Macbook Pro", 4000, d1);
		Products p2 = new Products(2L, "PC Gamer", 5000, d1);
		Products p3 = new Products(3L, "Pet House", 300, d2);
		
		List<Products> list = Arrays.asList(p1, p2, p3);
		return list;
	}
}
