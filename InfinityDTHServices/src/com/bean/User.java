package com.bean;

public class User {
	public static final Integer ADMIN = 1;
	public static final Integer OPERATOR = 2;
	public static final Integer RETAILER = 3;
	public static final Integer CUSTOMER = 4;
	
	private Integer userId;
	private String username;
	private String password;
	private Role role;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
