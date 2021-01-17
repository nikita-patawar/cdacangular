package com.fi.knowit.springrestapi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity implements Serializable 
{
	
	
	@Column(name="username")
	String name;
	
	@Id
	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;

	@Column(name="mobno")
	String mobno;

	@Column(name="role")
	int role;

	
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

	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

		public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

		public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		public UserEntity(String email, String password, int role) {
			super();
			this.email = email;
			this.password = password;
			this.role = role;
		}

}
