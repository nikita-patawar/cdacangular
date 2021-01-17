package com.fi.knowit.springrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.knowit.springrestapi.entity.OwnerEntity;

import com.fi.knowit.springrestapi.repository.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	OwnerRepository repository;
	@Override
	public boolean addNewOwner(OwnerEntity entity) {
		OwnerEntity returnEntity=repository.save(entity);
		return returnEntity!=null?true:false;
	}

	@Override
	public List<OwnerEntity> getAllOwners() {
		return repository.findAll();
	}

}
