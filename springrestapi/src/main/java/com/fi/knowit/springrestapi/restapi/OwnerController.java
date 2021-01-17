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
import com.fi.knowit.springrestapi.entity.OwnerEntity;

import com.fi.knowit.springrestapi.service.LoginService;
import com.fi.knowit.springrestapi.service.OwnerService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("workspace")
public class OwnerController {
	@Autowired
	OwnerService ownerService;
	@Autowired
	LoginService loginservice;
	
	
	@PostMapping("newWorkspace")
	public boolean insertNewOwner(@RequestBody OwnerEntity entity)
	{
		
		LoginEntity le = new LoginEntity(entity.getEmail(),entity.getPassword(),entity.getRole());
		loginservice.addLoginEntity(le);
		System.out.println(entity.getWname());
		
		return ownerService.addNewOwner(entity);
	}
	
	
	@GetMapping("allWorkspaces")
	public List<OwnerEntity>getAllOwners()
	{
		return ownerService.getAllOwners();
	}
}
