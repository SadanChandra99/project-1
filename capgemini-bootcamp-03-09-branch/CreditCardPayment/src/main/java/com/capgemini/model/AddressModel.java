package com.capgemini.model;

import org.springframework.stereotype.Component;

@Component
public class AddressModel {
	
	private int id;
	private int pincode;

	private String  doorNo;
	
	private String street;

	private String area;
	
	private String city;
	
	private String state;

	public AddressModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressModel(int id, int pincode, String doorNo, String street, String area, String city, String state) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.doorNo = doorNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressModel [id=" + id + ", pincode=" + pincode + ", doorNo=" + doorNo + ", street=" + street
				+ ", area=" + area + ", city=" + city + ", state=" + state + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	

}
