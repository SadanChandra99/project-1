package com.capgemini.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.Mapper.AccountMapper;
import com.capgemini.Mapper.AddressMapper;
import com.capgemini.Service.AccountService;
import com.capgemini.entity.Account;
import com.capgemini.model.AccountModel;
import com.capgemini.repository.AccountRepository;


@Component
public class AccountServiceImplement implements AccountService{

	@Autowired
	private AccountMapper accountmapper;
	@Autowired
	private AccountRepository accountrepository;

	
	
	                        //ADD ACCOUNT METHOD	
	@Override
	public AccountModel addAccount(AccountModel accountmodel) {
		// TODO Auto-generated method stub
		Account accountentity = accountrepository.save(accountmapper.MapModelToEntity(accountmodel));
		
		return accountmapper.MapEntityToModel(accountentity);
	}
                             // GET ACCOUNT BY ID METHOD
	@Override
	public AccountModel getAccountById(long id) {
		// TODO Auto-generated method stub
		Account accountentitygetbyid = accountrepository.findById(id);
		AccountModel accountmodelgetbyid = accountmapper.MapEntityToModel(accountentitygetbyid);
		return accountmodelgetbyid;
	}
                             // GET ALL ACCOUNTS METHOD
	@Override
	public List<AccountModel> getAllAccounts() {
		// TODO Auto-generated method stub
		List<AccountModel> accountmodellist = null;
		List<Account> accountentitylist = accountrepository.findAll();
		if(accountentitylist.size()>0) {
			accountmodellist = new ArrayList<>();
			
		}
		for (Account account: accountentitylist) {
			accountmodellist.add(accountmapper.MapEntityToModel(account));
		}
		return accountmodellist;
	}
                             // UPDATE ACCOUNT METHOD
	@Override
	public AccountModel updateAccount(long id, AccountModel accountmodel) {
		// TODO Auto-generated method stub
		Account accountentity = accountrepository.findById(id);
		accountentity.setAccountName(accountmodel.getAccountName());
		accountentity.setAccountType(accountmodel.getAccountType());
		accountentity.setBalance(accountmodel.getBalance());
		accountentity = accountrepository.save(accountentity);
		return accountmapper.MapEntityToModel(accountentity);
	}
                             // DELETE ACCOUNT METHOD
	@Override
	public String removeAccount(long id) {
		// TODO Auto-generated method stub
		
		
		accountrepository.deleteById(id);
		
		
			return "Account Deleted Successfully";
		
		
	}

}
