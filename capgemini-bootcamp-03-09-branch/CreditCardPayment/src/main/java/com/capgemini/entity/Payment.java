package com.capgemini.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "payments")
public class Payment {
	@Id
 long paymentId;
 String method;
 double amountDue;
public Payment(long paymentId, String method, double amountDue) {
	super();
	this.paymentId = paymentId;
	this.method = method;
	this.amountDue = amountDue;
}
public Payment() {
	super();
}
public long getPaymentId() {
	return paymentId;
}
public void setPaymentId(long paymentId) {
	this.paymentId = paymentId;
}
public String getMethod() {
	return method;
}
public void setMethod(String method) {
	this.method = method;
}
public double getAmountDue() {
	return amountDue;
}
public void setAmountDue(double amountDue) {
	this.amountDue = amountDue;
}
@Override
public String toString() {
	return "Payment [paymentId=" + paymentId + ", method=" + method + ", amountDue=" + amountDue + "]";
}

}