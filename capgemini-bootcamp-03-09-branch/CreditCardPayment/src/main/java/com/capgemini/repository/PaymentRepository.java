package com.capgemini.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.Payment;


public interface PaymentRepository extends JpaRepository<Payment,Long>{

}