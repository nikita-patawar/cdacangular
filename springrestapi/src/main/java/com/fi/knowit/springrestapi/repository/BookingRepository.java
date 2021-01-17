package com.fi.knowit.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fi.knowit.springrestapi.entity.Booking;
import com.fi.knowit.springrestapi.entity.LoginEntity;



@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> 
{
	
	//@Query(nativeQuery=true,value="select * from login where email=:email and password=:password")
	//public LoginEntity authenticate(@Param("email")String email,@Param("password")String password);
	@Query(nativeQuery=true,value="select * from booking where wname=:wname")
	public Booking findByname(@Param("wname")String wname);
	
}

