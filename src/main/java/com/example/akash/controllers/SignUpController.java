package com.example.akash.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.akash.models.SignUpModel;
import com.example.akash.services.SignUpServices;


@Controller
@ResponseBody
public class SignUpController {
	@Autowired
	SignUpServices sServices;
	
	@RequestMapping("/SignUp")
	String akash() {
		return "Welcome Akash Inkar";
	}
	
	
	@PostMapping("/saveuser")
	public ResponseEntity<SignUpModel> createUser(@RequestBody SignUpModel user){
		try {
			this.sServices.createUser(user);
			System.out.print(user);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	
	@GetMapping("/getAllUser")
	public ResponseEntity<List<SignUpModel>> getAllUser(){
		List<SignUpModel> data  = this.sServices.getUsers();
		if(data == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}else {
			return ResponseEntity.of(Optional.of(data));
		}
	}
	
	@GetMapping("/getStudent/{id}")
	public ResponseEntity<SignUpModel> getUser(@PathVariable("id") int id){
		SignUpModel result = sServices.getSingleUser(id);
		if(result==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.of(Optional.of(result));
		}
		
		
	}
	
	

}
