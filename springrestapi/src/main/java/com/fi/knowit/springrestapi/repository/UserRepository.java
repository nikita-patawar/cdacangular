package com.fi.knowit.springrestapi.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.fi.knowit.springrestapi.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> 
{
	
}
