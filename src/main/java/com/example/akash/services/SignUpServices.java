package com.example.akash.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.akash.models.SignUpModel;
import com.example.akash.repository.SignUpRepository;

@Component
public class SignUpServices {
	
	@Autowired
	private SignUpRepository signUpRepo;
	// save data into local
	public SignUpModel createUser(SignUpModel user) {
		SignUpModel result = signUpRepo.save(user);
		return result;
	}
	
	// get data from server	
	public List<SignUpModel> getUsers() {
		List<SignUpModel> result = (List<SignUpModel>) signUpRepo.findAll();
		return result ;
	}
	
	// get perticular user from his id
	
	public SignUpModel getSingleUser(int id) {
		SignUpModel data = signUpRepo.findById(id);
	return data;
	}
	
	

}
