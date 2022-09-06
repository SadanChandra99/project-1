package com.capgemini.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Service.TransactionService;
import com.capgemini.entity.Transaction;


@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/transactions")
	public  List<Transaction> listTransactions(){
		return transactionService.getAllTransaction();
	}
	
	@PostMapping("/addtransaction")
	public Transaction saveTransaction(@RequestBody Transaction transaction) {
		return transactionService.addTransaction(transaction);
	}
	
	@GetMapping("/transaction/{id}")
	public Transaction getTransactionById(@PathVariable long id) {
		return transactionService.getTransactionDetails(id);
	}
	
	@PutMapping("/updatetransaction/{id}")
	public Transaction updateTran(@PathVariable long id, @RequestBody Transaction transaction) {
		Transaction exTransaction = transactionService.getTransactionDetails(id);
		exTransaction.setTranId(id);
		exTransaction.setAmount(transaction.getAmount());
		exTransaction.setCardNumber(transaction.getCardNumber());
		exTransaction.setDescription(transaction.getDescription());
		exTransaction.setPaymentMethod(transaction.getPaymentMethod());
		exTransaction.setStatus(transaction.getStatus());
		exTransaction.setTranDate(transaction.getTranDate());
		
		return transactionService.updateTransaction(id, exTransaction);
	}
	
	@DeleteMapping("/deletetransaction/{id}")
	public String deleteTran(@PathVariable long id) {
		transactionService.removeTransaction(id);
		return "Transaction deleted";
	}

}
