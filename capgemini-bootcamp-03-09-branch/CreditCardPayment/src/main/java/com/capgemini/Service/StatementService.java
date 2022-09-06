package com.capgemini.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.model.StatementModel;


@Service
public interface StatementService {
	
	public StatementModel addStatement(StatementModel statementmodel);
	
	public StatementModel getStatementById(long statementid);
	
	public StatementModel updateStatement(long statementid, StatementModel statementmodel);

	public List<StatementModel> getAllStatement();
	
	public String removeStatement(long statementid);
}
