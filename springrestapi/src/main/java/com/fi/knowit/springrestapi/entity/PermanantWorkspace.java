package com.fi.knowit.springrestapi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="workspace")


public class PermanantWorkspace implements Serializable  {

	
	@Column(name="wname")
	String wname;
	
	@Id
	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;

	@Column(name="mobno")
	String mobno;

	@Column(name="area")
	String area;

	@Column(name="address")
	String address;

	@Column(name="image")
	String img;
	
	@Column(name="capacity")
	int capacity;
	
	@Column(name="role")
	int role;

	


	public String getWname() {
		return wname;
	}


	public void setWname(String wname) {
		this.wname = wname;
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


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}



	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public 	int getRole() {
		return role;
	}


	public void setRole(int role) {
		this.role = role;
	}


	public PermanantWorkspace(String email, String password, int role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}


	public PermanantWorkspace() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	
	
}
