package com.capgemini.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.Service.CustomerService;
import com.capgemini.entity.Customer;
import com.capgemini.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void removeCustomer(long custId) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(custId);
	}

	@Override
	public Customer updateCustomer(long custId, Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomer(long custId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(custId).get();
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}


}
