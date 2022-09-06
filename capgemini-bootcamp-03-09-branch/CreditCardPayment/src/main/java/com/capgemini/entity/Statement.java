package com.capgemini.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "statements")

public class Statement {
	
	@Id
	@Column
	private long statementid;
	@Column
	private double dueAmount;
	@Column
	private LocalDate billingDate;
	@Column
	private LocalDate dueDate;
	@ManyToOne
	private Customer customer;
	
	public Statement(long statementid, double dueAmount, LocalDate billingDate, LocalDate dueDate,
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
	
	public Statement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StatementEntity [statementid=" + statementid + ", dueAmount=" + dueAmount + ", billingDate="
				+ billingDate + ", dueDate=" + dueDate + "]";
	}
	
	

}
