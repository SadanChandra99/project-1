package com.capgemini.Service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Service.PaymentService;
import com.capgemini.entity.Payment;
import com.capgemini.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
@Autowired
private PaymentRepository repo;
public  PaymentServiceImpl(PaymentRepository repo) {
	super();
	this.repo=repo;
}
   @Override
	public Payment addPayment(Payment payment) {
		return this.repo.save(payment);
		
	}

	@Override
	public void  removePayment(long paymentId) {
		repo.deleteById(paymentId);
		
	}

	@Override
	public Payment updatePayment(long paymentId, Payment payment) {
		return repo.save(payment);
	}

	@Override
	public Payment getPayment(long paymentId) {
		return repo.findById(paymentId).get();
		
	}

}