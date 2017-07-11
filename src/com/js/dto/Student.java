package com.js.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private String roll;
	private String name;
	private String address;
	private String mobileNumber;
	private String emailId;
	
	@Id
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Student(String roll, String name, String address,
			String mobileNumber, String emailId) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	public Student() {
		super();
	}
	public Student(String roll) {
		super();
		this.roll = roll;
	}
}
