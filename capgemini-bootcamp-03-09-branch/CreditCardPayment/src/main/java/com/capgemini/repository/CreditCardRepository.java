package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, Long>{
	
	@SuppressWarnings("unchecked")
	public CreditCard save(CreditCard creditcardentity);

	public CreditCard findById(long id);
	
	public List<CreditCard> findAll();
	
	public void deleteById(long id);
}
