package com.fi.knowit.springrestapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fi.knowit.springrestapi.entity.Booking;

@Service
public interface BookingService {
	boolean addNewBooking(Booking entity);
	List<Booking>getAllBookings();
	Booking getByUname(String name);

}
