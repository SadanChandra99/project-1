package com.capgemini.model;

import java.time.LocalDate;

import javax.persistence.OneToOne;

import com.capgemini.entity.Customer;


public class StatementModel {

	private long statementid;
	private double dueAmount;
	private LocalDate billingDate;
	private LocalDate dueDate;
	@OneToOne
	private Customer customer;
	
	public StatementModel(long statementid, double dueAmount, LocalDate billingDate, LocalDate dueDate,
			Customer customer) {
		super();
		this.statementid = statementid;
		this.dueAmount = dueAmount;
		this.billingDate = billingDate;
		this.dueDate = dueDate;
		this.customer = customer;
	}
	
	public long getStatementid() {
		return statementid;
	}

	public void setStatementid(long statementid) {
		this.statementid = statementid;
	}

	public double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}

	public LocalDate getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public StatementModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StatementModel [statementid=" + statementid + ", dueAmount=" + dueAmount + ", billingDate="
				+ billingDate + ", dueDate=" + dueDate + "]";
	}
	
	
}
