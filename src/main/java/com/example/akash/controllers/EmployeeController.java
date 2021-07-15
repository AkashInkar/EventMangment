package com.example.akash.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.akash.models.EventListModel;
import com.example.akash.services.EmployeeService;

@RestController
public class EmployeeController {
	
	 @Autowired
	EmployeeService service;
	 
	 
	 @GetMapping("/data/{pageSize}") 
	    public ResponseEntity<List<EventListModel>> getAllEmployees(
	                        @RequestParam(defaultValue = "0") Integer pageNo, 
	                        @PathVariable("pageSize") Integer pageSize,
	                        @RequestParam(defaultValue = "id") String sortBy) 
	    {
	        List<EventListModel> list = service.getAllEmployees(pageNo, pageSize, sortBy);
	 
	        return new ResponseEntity<List<EventListModel>>(list, HttpStatus.OK); 
	    }
	 
	 
	 @PostMapping("/createEvent")
	 public ResponseEntity<EventListModel> createEvent(EventListModel data) {
		 try {
			 this.service.createUser(data);
			 return ResponseEntity.status(HttpStatus.CREATED).build();
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		 
		 
		
	}

}
