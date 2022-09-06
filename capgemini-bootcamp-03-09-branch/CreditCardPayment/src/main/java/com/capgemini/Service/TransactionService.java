package com.capgemini.Service;

import java.util.List;

import com.capgemini.entity.Transaction;


public interface TransactionService {
	
	Transaction addTransaction(Transaction transaction);
	void removeTransaction(long id);
	Transaction updateTransaction(long id, Transaction transaction);
	Transaction getTransactionDetails(long id);
	List<Transaction> getAllTransaction();

}
