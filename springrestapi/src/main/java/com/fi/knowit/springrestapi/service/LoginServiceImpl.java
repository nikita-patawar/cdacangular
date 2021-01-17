package com.fi.knowit.springrestapi.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.knowit.springrestapi.entity.LoginEntity;

import com.fi.knowit.springrestapi.repository.LoginRepository;




@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository repository;

	@Override
	public boolean addLoginEntity(LoginEntity entity) {
		LoginEntity returnEntity=repository.save(entity);
		return returnEntity!=null?true:false;
	}

	@Override
	/*public boolean authenticateLogin(LoginEntity entity) {
	 LoginEntity returnentity=repository.authenticate(entity.getEmail(),entity.getPassword());
		return returnentity!=null?true:false;
	}*/


	
	
	public int authenticateLogin(LoginEntity entity) {
		 LoginEntity returnentity=repository.authenticate(entity.getEmail(),entity.getPassword());
			if(returnentity != null)
			{
				//System.out.println(entity);
				//System.out.println(returnentity.getRole());
				
				return returnentity.getRole();
			}
			else
				return (Integer) null;
		}

	@Override
	public int getRol(LoginEntity e) {
		
		return e.getRole();
	}
	
	
	
}



