package com.fi.knowit.springrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.knowit.springrestapi.entity.OwnerEntity;
import com.fi.knowit.springrestapi.entity.PermanantWorkspace;
import com.fi.knowit.springrestapi.repository.OwnerRepository;
import com.fi.knowit.springrestapi.repository.PermanantWorkspaceRepository;

@Service
public class WorkspaceServiceImpl implements WorkspaceService {
	@Autowired
	PermanantWorkspaceRepository repository;
	@Override
	public List<PermanantWorkspace> getAllOwners() {
		return repository.findAll();
	}

	@Override
	public boolean addNewOwner(PermanantWorkspace entity) {
		PermanantWorkspace returnEntity=repository.save(entity);
		return returnEntity!=null?true:false;
	}
}
