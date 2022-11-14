package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entities.Customer;
import com.masai.service.customer.CustomerServiceImpl;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl custService;
	
	@GetMapping("/hello")
	public String helloword() {
		return "My name is Shashank Dubey";
	}
	
	@PostMapping("/create")
	public ResponseEntity<Customer> addCustomer(@Valid @RequestBody Customer customer) {
		return custService.insertCustomer(customer);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestParam String user,@RequestParam String pass,@RequestBody Customer customer) {
		return custService.updateCustomer(customer, user, pass);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer(@RequestBody Customer customer) {
		return custService.deleteCustomer(customer);
	}
}
