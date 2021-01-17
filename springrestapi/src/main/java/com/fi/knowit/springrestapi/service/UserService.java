package com.fi.knowit.springrestapi.service;

import java.util.List;

import com.fi.knowit.springrestapi.entity.UserEntity;

public interface UserService 
{
	boolean addNewUser(UserEntity entity);
	List<UserEntity>getAllUsers();
}
