package com.capgemini.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Service.PaymentService;
import com.capgemini.entity.Payment;

@RestController
@RequestMapping("/payments")
public class PaymentControllers {
@Autowired
private PaymentService repo1;
@PostMapping("/credits/add")
public Payment addPayment(@RequestBody Payment payment) {
return repo1.addPayment(payment);	
}
@PutMapping("/credits/update/{no}")
public Payment updatePayment(@PathVariable(value="no")long paymentId, @RequestBody Payment payment ) {
	Payment p = repo1.getPayment(paymentId);
	p.setAmountDue(payment.getAmountDue());
	p.setMethod(payment.getMethod());
	p.setPaymentId(payment.getPaymentId());
	return repo1.updatePayment(paymentId, p);
}
@DeleteMapping("/credits/delete/{no}")
public String  removePayment(@PathVariable(value="no")long paymentId) {
	 repo1.removePayment(paymentId);
	 return "Deletion is successfull";
}
@GetMapping("/credits/{no}")
public Payment getPayment(@PathVariable(value="no")long paymentId) {
	return repo1.getPayment(paymentId);
}


}
