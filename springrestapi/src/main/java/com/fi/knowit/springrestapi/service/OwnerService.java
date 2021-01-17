package com.fi.knowit.springrestapi.service;

import java.util.List;

import com.fi.knowit.springrestapi.entity.OwnerEntity;


public interface OwnerService {
	boolean addNewOwner(OwnerEntity entity);
	List<OwnerEntity>getAllOwners();
}
