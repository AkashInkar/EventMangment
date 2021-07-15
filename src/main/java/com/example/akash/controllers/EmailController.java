package com.example.akash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.akash.models.EmailModel;
import com.example.akash.services.EmailServices;

@Controller
public class EmailController {
	@Autowired
	EmailServices emailservice;
	
	@RequestMapping(value = "/sendMail",method = RequestMethod.POST)
	public ResponseEntity<?> sendMail(@RequestBody EmailModel data){
		
		boolean results = this.emailservice.sendMail(data.getSubject(), data.getMessage(), data.getTo());
		if(results) {
			return ResponseEntity.ok("ok");
		}else {
			
			System.out.print(data.getTo());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Some thing went wrong");
		}
		
	}

}
