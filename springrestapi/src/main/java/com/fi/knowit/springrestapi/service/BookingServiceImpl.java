package com.fi.knowit.springrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.knowit.springrestapi.entity.Booking;

import com.fi.knowit.springrestapi.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	BookingRepository repository;
	@Override
	public boolean addNewBooking(Booking entity) {
		Booking returnEntity=repository.save(entity);
		return returnEntity!=null?true:false;
	}

	@Override
	public List<Booking> getAllBookings() {
		return repository.findAll();
	}

	@Override
	public Booking getByUname(String name) {
		Booking b=repository.findByname(name);
		return b;
	}

}
	


