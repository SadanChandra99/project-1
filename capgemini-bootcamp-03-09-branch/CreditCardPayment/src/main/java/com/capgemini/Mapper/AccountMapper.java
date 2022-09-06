package com.capgemini.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.capgemini.entity.Account;
import com.capgemini.model.AccountModel;

@Component
public class AccountMapper {
	
	public Account MapModelToEntity(AccountModel accountmodel) {
		Account accountentity = new Account();
		accountentity.setAccountId(accountmodel.getAccountId());
		accountentity.setAccountName(accountmodel.getAccountName());
		accountentity.setAccountType(accountmodel.getAccountType());
		accountentity.setBalance(accountmodel.getBalance());
		return accountentity;
	}
	
	public AccountModel MapEntityToModel(Account accountentity) {
		AccountModel accountmodel = new AccountModel();
		BeanUtils.copyProperties(accountentity, accountmodel);
		return accountmodel;
	}

}
