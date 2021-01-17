package com.fi.knowit.springrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.knowit.springrestapi.entity.UserEntity;
import com.fi.knowit.springrestapi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	UserRepository repository;

	
	@Override
	public boolean addNewUser(UserEntity entity)
	{
		UserEntity returnEntity=repository.save(entity);
		return returnEntity!=null?true:false;
	}

	@Override
	public List<UserEntity> getAllUsers()
	{
		return repository.findAll();
	}

}
