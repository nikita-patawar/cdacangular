package com.fi.knowit.springrestapi.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fi.knowit.springrestapi.entity.LoginEntity;
import com.fi.knowit.springrestapi.entity.UserEntity;
import com.fi.knowit.springrestapi.service.LoginService;
import com.fi.knowit.springrestapi.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("user")
public class UserController 
{
	@Autowired
	UserService userService;
	
	@Autowired
	LoginService loginservice;
	@PostMapping("newUser")
	public boolean insertNewUser(@RequestBody UserEntity entity)
	{
		System.out.println(entity.getPassword());
		LoginEntity le = new LoginEntity(entity.getEmail(),entity.getPassword(),entity.getRole());
		loginservice.addLoginEntity(le);
		
		return userService.addNewUser(entity);
	}
	
	
	@GetMapping("allUsers")
	public List<UserEntity>getAllUsers()
	{
		return userService.getAllUsers();
	}
	
}
