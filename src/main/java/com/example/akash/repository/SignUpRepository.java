package com.example.akash.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.akash.models.SignUpModel;

public interface SignUpRepository extends CrudRepository<SignUpModel, Integer> {

	public SignUpModel findById(int Id);
	

}
