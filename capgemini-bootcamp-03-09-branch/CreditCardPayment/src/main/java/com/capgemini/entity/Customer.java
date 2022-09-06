package com.capgemini.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "contactNo")
	private String contactNo;
	
	@Column(name = "localDate")
	private String localDate;
	
	@OneToMany
	private List<Transaction> transactions;
	@OneToMany
	private List<Address> addresses;
	@OneToMany 
	private List<CreditCard> creditCards;
	@ManyToMany
	private List<Account> accounts;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long userId, String name, String email, String contactNo, String localDate,
			List<Transaction> transactions, List<Address> addresses, List<CreditCard> creditCards,
			List<Account> accounts) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.localDate = localDate;
		this.transactions = transactions;
		this.addresses = addresses;
		this.creditCards = creditCards;
		this.accounts = accounts;
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
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<CreditCard> getCreditCards() {
		return creditCards;
	}
	public void setCreditCards(List<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", localDate=" + localDate + ", transactions=" + transactions + ", addresses=" + addresses
				+ ", creditCards=" + creditCards + ", accounts=" + accounts + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accounts, addresses, contactNo, creditCards, email, localDate, name, transactions, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(accounts, other.accounts) && Objects.equals(addresses, other.addresses)
				&& Objects.equals(contactNo, other.contactNo) && Objects.equals(creditCards, other.creditCards)
				&& Objects.equals(email, other.email) && Objects.equals(localDate, other.localDate)
				&& Objects.equals(name, other.name) && Objects.equals(transactions, other.transactions)
				&& userId == other.userId;
	}
	
	
	
	
	
	

}
