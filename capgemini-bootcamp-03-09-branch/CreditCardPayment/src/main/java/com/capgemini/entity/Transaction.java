package com.capgemini.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transactions")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long tranId;
	
	@Column(name = "cardNumber")
	private String cardNumber;
	
	@Column(name = "trandate")
	private String tranDate;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "paymentMethod")
	private String paymentMethod;
	
	@Column(name = "description")
	private String description;
	
	public Transaction() {
		
	}

	public Transaction(long tranId, String cardNumber, String tranDate, String status, double amount,
			String paymentMethod, String description) {
		super();
		this.tranId = tranId;
		this.cardNumber = cardNumber;
		this.tranDate = tranDate;
		this.status = status;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.description = description;
	}

	public long getTranId() {
		return tranId;
	}

	public void setTranId(long tranId) {
		this.tranId = tranId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getTranDate() {
		return tranDate;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Transaction [tranId=" + tranId + ", cardNumber=" + cardNumber + ", tranDate=" + tranDate + ", status="
				+ status + ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", description=" + description
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, cardNumber, description, paymentMethod, status, tranDate, tranId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(cardNumber, other.cardNumber) && Objects.equals(description, other.description)
				&& Objects.equals(paymentMethod, other.paymentMethod) && Objects.equals(status, other.status)
				&& Objects.equals(tranDate, other.tranDate) && tranId == other.tranId;
	}
	
	

}
