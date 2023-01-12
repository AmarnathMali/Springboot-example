package com.springbootrest.controller;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.springbootrest.model.Product;
import com.springbootrest.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping("/ListOfProducts")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> products =productService.getAllProducts();
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	@GetMapping({"/getById/{id}"})
	public ResponseEntity<Product> getProduct(@PathVariable Integer id){
		return new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);
	}
	
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		
		return ResponseEntity.ok(productService.insert(product));
	}
	
	@PutMapping("/updateProduct/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable Integer id,@RequestBody Product product){
		productService.updateProduct(id, product);
		return new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);

	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public  ResponseEntity<Product> deleteProduct(@PathVariable Integer id){
		productService.deleteProduct(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
