package com.fi.knowit.springrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.fi.knowit.springrestapi.entity.OwnerEntity;

@Repository
public interface OwnerRepository extends JpaRepository<OwnerEntity, Integer> 
{
	
}