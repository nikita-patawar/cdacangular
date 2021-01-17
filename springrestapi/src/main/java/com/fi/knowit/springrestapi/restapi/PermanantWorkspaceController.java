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
import com.fi.knowit.springrestapi.entity.PermanantWorkspace;
import com.fi.knowit.springrestapi.service.LoginService;
import com.fi.knowit.springrestapi.service.OwnerService;
import com.fi.knowit.springrestapi.service.WorkspaceService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("finalWorkspace")
public class PermanantWorkspaceController {
	@Autowired
	WorkspaceService workspaceService;
	@Autowired
	LoginService loginservice;
	
	
	@PostMapping("finalWorkspace")
	public boolean insertNewOwner(@RequestBody PermanantWorkspace entity)
	{
		
		LoginEntity le = new LoginEntity(entity.getEmail(),entity.getPassword(),entity.getRole());
		loginservice.addLoginEntity(le);
		System.out.println(entity.getWname());
		
		return workspaceService.addNewOwner(entity);
	}
	
	
	@GetMapping("allFinalWorkspaces")
	public List<PermanantWorkspace>getAllOwners()
	{
		return workspaceService.getAllOwners();
	}
}
