package com.capgemini.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.Mapper.StatementMapper;
import com.capgemini.Service.StatementService;
import com.capgemini.entity.Statement;
import com.capgemini.model.StatementModel;
import com.capgemini.repository.StatementRepository;

@Component
public class StatementServiceImplement implements StatementService {
	
	@Autowired
	private StatementMapper statementmapper;
	@Autowired
	private StatementRepository statementrepository;
	
	
	@Override
	public StatementModel addStatement(StatementModel statementmodel) {
		// TODO Auto-generated method stub
		Statement statemententity = statementrepository.save(statementmapper.MapModelToEntity(statementmodel));
		
		return statementmapper.MapEntityToModel(statemententity);
		
	}
	@Override
	public StatementModel getStatementById(long statementid) {
		// TODO Auto-generated method stub
		Statement statemententitygetbyid = statementrepository.findById(statementid);
		StatementModel statementmodelgetbyid = statementmapper.MapEntityToModel(statemententitygetbyid);
				
		return statementmodelgetbyid;
		
	}
	@Override
	public StatementModel updateStatement(long statementid, StatementModel statementmodel) {
		// TODO Auto-generated method stub
		Statement statemententity = statementrepository.findById(statementid);
		statemententity.setDueAmount(statementmodel.getDueAmount());
		statemententity.setBillingDate(statementmodel.getBillingDate());
		statemententity.setDueDate(statementmodel.getDueDate());
		statemententity.setCustomer(statementmodel.getCustomer());
		return statementmapper.MapEntityToModel(statemententity);
	}
	@Override
	public List<StatementModel> getAllStatement() {
		// TODO Auto-generated method stub
		List<StatementModel> statementmodellist = null;
		List<Statement> statemententitylist = statementrepository.findAll();
		if(statemententitylist.size()>0) {
			statementmodellist = new ArrayList<>();
		}
		for(Statement statement: statemententitylist) {
			statementmodellist.add(statementmapper.MapEntityToModel(statement));
		}
		return statementmodellist;
	}
	@Override
	public String removeStatement(long statementid) {
		// TODO Auto-generated method stub
		statementrepository.deleteById(statementid);
		return "Statement Deleted Successfully";
	}
						

}
