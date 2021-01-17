package com.fi.knowit.springrestapi.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking implements Serializable {
	@Override
	public String toString() {
		return "Booking [bid=" + bid + ", uname=" + uname + ", wname=" + wname + ", seats=" + seats + ", date=" + date
				+ ", time=" + time + ", area=" + area + "]";
	}

	@Id
	@Column(name="bid")
	@GeneratedValue(generator="increment")
	int bid;
	@Column(name="uname")
	String uname;
	
	
	@Column(name="wname")
	String wname;
	
	@Column(name="seats")
	int seats;
	

	@Column(name="date")
	String date;

	public int getBid() {
		return bid;
	}

	public Booking(int bid, String uname, String wname, int seats, String date, String time, String area) {
		super();
		this.bid = bid;
		this.uname = uname;
		this.wname = wname;
		this.seats = seats;
		this.date = date;
		this.time = time;
		this.area = area;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name="time")
	String time;
	
	@Column(name="area")
	String area;
	

}
