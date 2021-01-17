package com.fi.knowit.springrestapi.service;

import com.fi.knowit.springrestapi.entity.LoginEntity;


public interface LoginService {
	int authenticateLogin(LoginEntity entity);
	boolean addLoginEntity(LoginEntity entity);
	int getRol(LoginEntity e);

}
