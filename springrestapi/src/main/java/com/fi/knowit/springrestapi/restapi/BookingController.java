package com.fi.knowit.springrestapi.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fi.knowit.springrestapi.entity.Booking;

import com.fi.knowit.springrestapi.service.BookingService;
@RestController
@RequestMapping("booking")

public class BookingController {
	@Autowired
	BookingService bookingservice;
	
	
	
	@PostMapping("newBooking")
	public boolean insertNewBooking(@RequestBody Booking entity)
	{
		return bookingservice.addNewBooking(entity);
	}
	
	

	@GetMapping("allBookingsByName")
	public List<Booking> getAllBookingName(String name)
	{
		return  (List<Booking>) bookingservice.getByUname(name);
	}
	
}



