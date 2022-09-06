package com.capgemini.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.capgemini.entity.Account;
import com.capgemini.entity.Address;
import com.capgemini.entity.CreditCard;
import com.capgemini.entity.Statement;
import com.capgemini.entity.Transaction;

public class CustomerModel {

private long userId;
	
	
	private String name;
	
	
	private String email;

	private String contactNo;

	private String localDate;

	private String address;

	private List<Long> statementId;

	private List<Long> transactionsId;
	
	private List<Long> addressId;

	private List<Long> creditCardId;

	private List<Long> accountId;

	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerModel(long userId, String name, String email, String contactNo, String localDate, String address,
			List<Long> statementId, List<Long> transactionsId, List<Long> addressId, List<Long> creditCardId,
			List<Long> accountId) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.localDate = localDate;
		this.address = address;
		this.statementId = statementId;
		this.transactionsId = transactionsId;
		this.addressId = addressId;
		this.creditCardId = creditCardId;
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "CustomerModel [userId=" + userId + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", localDate=" + localDate + ", address=" + address + ", statementId=" + statementId
				+ ", transactionsId=" + transactionsId + ", addressId=" + addressId + ", creditCardId=" + creditCardId
				+ ", accountId=" + accountId + "]";
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getLocalDate() {
		return localDate;
	}

	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Long> getStatementId() {
		return statementId;
	}

	public void setStatementId(List<Long> statementId) {
		this.statementId = statementId;
	}

	public List<Long> getTransactionsId() {
		return transactionsId;
	}

	public void setTransactionsId(List<Long> transactionsId) {
		this.transactionsId = transactionsId;
	}

	public List<Long> getAddressId() {
		return addressId;
	}

	public void setAddressId(List<Long> addressId) {
		this.addressId = addressId;
	}

	public List<Long> getCreditCardId() {
		return creditCardId;
	}

	public void setCreditCardId(List<Long> creditCardId) {
		this.creditCardId = creditCardId;
	}

	public List<Long> getAccountId() {
		return accountId;
	}

	public void setAccountId(List<Long> accountId) {
		this.accountId = accountId;
	}
	
	
}
