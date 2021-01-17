package com.fi.knowit.springrestapi.restapi;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fi.knowit.springrestapi.entity.LoginEntity;

import com.fi.knowit.springrestapi.service.LoginService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("login")
public class LoginController 
{
	@Autowired
	LoginService loginService;
	
	@PostMapping("authenticate")
	public int authenticate(@RequestBody LoginEntity entity)
	{
		return loginService.authenticateLogin(entity);
		
	}
	

	@PostMapping("newUser1")
	public boolean insertNewUser(@RequestBody LoginEntity entity)
	{
		return loginService.addLoginEntity(entity);
	}
	
	@PostMapping("role")
	public int getRoll(@RequestBody LoginEntity entity)
	{
		return loginService.getRol(entity);
		
	}
	
	
	
}