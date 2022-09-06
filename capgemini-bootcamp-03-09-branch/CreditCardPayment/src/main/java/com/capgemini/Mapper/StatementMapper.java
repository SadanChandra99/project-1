package com.capgemini.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.capgemini.entity.Statement;
import com.capgemini.model.StatementModel;

@Component
public class StatementMapper {
	
	public Statement MapModelToEntity(StatementModel statementmodel) {
		Statement statemententity =  new Statement();
		statemententity.setStatementid(statementmodel.getStatementid());
		statemententity.setDueAmount(statementmodel.getDueAmount());
		statemententity.setBillingDate(statementmodel.getBillingDate());
		statemententity.setDueDate(statementmodel.getDueDate());
		statemententity.setCustomer(statementmodel.getCustomer());
		return statemententity;
	}
	
	public StatementModel MapEntityToModel(Statement statemententity) {
		StatementModel statementmodel = new StatementModel();
		BeanUtils.copyProperties(statemententity, statementmodel);
		return statementmodel;
	}


}
