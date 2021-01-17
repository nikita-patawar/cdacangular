package com.fi.knowit.springrestapi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="login")
public class LoginEntity implements Serializable  {
	
	@Id
	@Column(name="email")
	String email;
	
	@Override
	public String toString() {
		return "LoginEntity [email=" + email + ", password=" + password + ", role=" + role + "]";
	}
	@Column(name="password")
	String password;
	
    @Column(name="roleid")
	int role;
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public LoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginEntity(String email, String password, int role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	
	
}
