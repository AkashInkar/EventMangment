package com.example.akash.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.akash.models.EventListModel;
import com.example.akash.repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	 @Autowired
	 EmployeeRepository repository;
	 
	 
	 public List<EventListModel> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy)
	    {
	        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
	 
	        Page<EventListModel> pagedResult = repository.findAll(paging);
	         
	        if(pagedResult.hasContent()) {
	            return pagedResult.getContent();
	        } else {
	            return new ArrayList<EventListModel>();
	        }
	    }
	 
	 
	 // save data 
	 public EventListModel createUser(EventListModel data) {
		 EventListModel result=this.repository.save(data);
		
		 return result;
		 
	 }
	 
}
