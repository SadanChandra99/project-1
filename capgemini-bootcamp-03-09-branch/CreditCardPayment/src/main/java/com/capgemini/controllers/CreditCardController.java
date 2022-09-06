package com.capgemini.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Service.CreditCardService;
import com.capgemini.model.CreditCardModel;

@RestController
@RequestMapping("/creditcard")
public class CreditCardController {

	@Autowired
	private CreditCardService creditcardservice;
	
	@PostMapping(value = "/add" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CreditCardModel> addCreditCard(@RequestBody CreditCardModel creditcardmodel){
		CreditCardModel creditcard = creditcardservice.addCreditCard(creditcardmodel);
		return ResponseEntity.ok(creditcard);
	}
	
	@GetMapping(value = "/getbyid/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CreditCardModel> getCreditCardById(@PathVariable("id") long id){
		CreditCardModel creditcard = creditcardservice.getCreditCardById(id);
		return ResponseEntity.ok(creditcard);
	}
	
	@GetMapping(value = "/getall", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CreditCardModel>> getAllCreditCards(){
		List<CreditCardModel> creditcards = creditcardservice.getAllCreditCards();
		return ResponseEntity.ok(creditcards);
	}
	
	@PutMapping(value = "/update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CreditCardModel> updateCreditCard(@PathVariable("id") long id, @RequestBody CreditCardModel creditcardmodel){
		CreditCardModel creditcard = creditcardservice.updateCreditCard(id, creditcardmodel);
		return ResponseEntity.ok(creditcard);
	}
	
	@DeleteMapping(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteCreditCard(@PathVariable long id){
		String creditcard = creditcardservice.removeCreditCard(id);
		return ResponseEntity.ok(creditcard);
	}
	
}
