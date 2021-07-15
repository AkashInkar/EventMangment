package com.example.akash.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.akash.models.EventListModel;
import com.example.akash.services.EventDetailsServices;

@Controller
public class EventDetailsController {
	@Autowired
	EventDetailsServices sServices;

	
	
	// get all event in the list
	@PostMapping("/saveEvent")
	public ResponseEntity<EventListModel> saveEvent(@RequestBody EventListModel mEventModel){
		try {
			this.sServices.saveEvent(mEventModel);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
		System.out.println(e.toString());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	
	@GetMapping("/allEvent")
	public ResponseEntity<List<EventListModel>> getAllEvent(){
			List<EventListModel> list = this.sServices.getAllEvent();
			if(list == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			} else {
				return ResponseEntity.of(Optional.of(list));
			}
	
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEvent(@RequestBody EventListModel model) {
		this.sServices.deleteEvent(model);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PutMapping("update/{userId}")
	public ResponseEntity<EventListModel> updateList(@RequestBody EventListModel model,@PathVariable int userId){	
		try {
			this.sServices.updateEvent(model, userId);
			return ResponseEntity.status(HttpStatus.CREATED).build();
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}


}
