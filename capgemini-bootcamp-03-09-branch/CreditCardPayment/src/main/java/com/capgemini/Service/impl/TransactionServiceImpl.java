package com.capgemini.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.Service.TransactionService;
import com.capgemini.entity.Transaction;
import com.capgemini.repository.TransactionRepository;


@Service
public class TransactionServiceImpl implements TransactionService{
	
	private TransactionRepository transactionRepository;

public TransactionServiceImpl(TransactionRepository transactionRepository) {
		super();
		this.transactionRepository = transactionRepository;
	}

	@Override
	public Transaction addTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionRepository.save(transaction);
	}

	@Override
	public void removeTransaction(long id) {
		// TODO Auto-generated method stub
		 transactionRepository.deleteById(id);
	}

	@Override
	public Transaction updateTransaction(long id, Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionRepository.save(transaction);
	}

	@Override
	public Transaction getTransactionDetails(long id) {
		// TODO Auto-generated method stub
		return transactionRepository.findById(id).get();
	}

	@Override
	public List<Transaction> getAllTransaction() {
		// TODO Auto-generated method stub
		return transactionRepository.findAll();
	}



}
