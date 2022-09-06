package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

	@SuppressWarnings("unchecked")
	public Address save(Address addressentity);
	
	public Address findById(int id);
	
	public List<Address> findAll();
	
	public String deleteById(int id);
}
