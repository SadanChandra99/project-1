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
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Service.StatementService;
import com.capgemini.model.StatementModel;

@RestController
public class StatementController {
	
	@Autowired
	private StatementService statementservice;
	
	@PostMapping(value = "/addstatement" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StatementModel> addStatement(@RequestBody StatementModel statementmodel){
		return ResponseEntity.ok(statementservice.addStatement(statementmodel));
	}
	
	@GetMapping(value = "/getstatementbyid/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StatementModel> getStatementById(@PathVariable("id") long id){
		return ResponseEntity.ok(statementservice.getStatementById(id));
	}
	
	@GetMapping(value = "/getallstatements", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StatementModel>> getAllStatements(){
		return ResponseEntity.ok(statementservice.getAllStatement());
	}
	
	@PutMapping(value = "/updatestatement/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StatementModel> updateStatement(@PathVariable("id") long id, @RequestBody StatementModel statementmodel){
		return ResponseEntity.ok(statementservice.updateStatement(id, statementmodel));
	}
	
	@DeleteMapping(value = "/deletestatement/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteStatement(@PathVariable long id){
		return ResponseEntity.ok(statementservice.removeStatement(id));
	}
	
}



