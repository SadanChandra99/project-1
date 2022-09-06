package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Statement;

@Repository
public interface StatementRepository extends JpaRepository<Statement, Long>{
	
	@SuppressWarnings("unchecked")
	public Statement save(Statement statemententity);

	public Statement findById(long statementid);
	
	public List<Statement> findAll();
	
	public void deleteById(long statementid);
}
