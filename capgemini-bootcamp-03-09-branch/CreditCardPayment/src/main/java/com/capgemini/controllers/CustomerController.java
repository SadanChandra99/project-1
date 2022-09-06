package com.capgemini.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Service.CustomerService;
import com.capgemini.entity.Customer;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/customers")
	public  List<Customer> listCustomers() {
		return customerService.getAllCustomer();
	}
	
	@GetMapping("/customer/{custId}")
	public Customer  getCustomerbyid(@PathVariable long custId) {
		return customerService.getCustomer(custId);
	}
	
	@PostMapping("/addcustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@PutMapping("/updatecustomer/{custId}")
	public Customer updateCust(@PathVariable long custId, @RequestBody Customer customer) {
		
		Customer existingCustomer = customerService.getCustomer(custId);
		existingCustomer.setUserId(custId);
		existingCustomer.setName(customer.getName());
		existingCustomer.setContactNo(customer.getContactNo());
		existingCustomer.setEmail(customer.getEmail());
		existingCustomer.setLocalDate(customer.getLocalDate());
		existingCustomer.setAccounts(customer.getAccounts());
		existingCustomer.setCreditCards(customer.getCreditCards());
		existingCustomer.setAddresses(customer.getAddresses());
		existingCustomer.setTransactions(customer.getTransactions());
		
		return customerService.updateCustomer(custId, existingCustomer);
	}
	
	@DeleteMapping("/deletecustomer/{custId}")
	public String deleteCustomer(@PathVariable long custId) {
		customerService.removeCustomer(custId);
		return "deleted";
	}
	

}
