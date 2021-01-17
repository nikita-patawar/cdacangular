package com.fi.knowit.springrestapi.service;

import java.util.List;

import com.fi.knowit.springrestapi.entity.OwnerEntity;
import com.fi.knowit.springrestapi.entity.PermanantWorkspace;

public interface WorkspaceService {
	boolean addNewOwner(PermanantWorkspace entity);
	List<PermanantWorkspace>getAllOwners();
}
