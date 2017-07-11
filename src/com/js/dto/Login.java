package com.js.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {

	private String userName;
	private String password;
	private String level;
	
	@Id
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public Login(String userName, String password, String level) {
		super();
		this.userName = userName;
		this.password = password;
		this.level = level;
	}
	public Login() {
		super();
	}
	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password
				+ ", level=" + level + "]";
	}
	
	
	
}
