package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	
	@SuppressWarnings("unchecked")
	public Account save(Account accountentity);
	
	public Account findById(long id);
	
	public List<Account> findAll();
	
	public void deleteById(long id);

	
}
