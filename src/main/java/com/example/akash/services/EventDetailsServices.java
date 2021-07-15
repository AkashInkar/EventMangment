package com.example.akash.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.akash.models.EventListModel;
import com.example.akash.repository.EventDetailsRepository;

@Service
public class EventDetailsServices {
	@Autowired
	private EventDetailsRepository evRepo;
	
	// save event
	public EventListModel saveEvent(EventListModel event) {
		EventListModel result  = evRepo.save(event);
		return result;
	}
	
	// get All event 
	public List<EventListModel> getAllEvent(){
		List<EventListModel> result = (List<EventListModel>)evRepo.findAll();
		return result;
	}
	
	// delete the event 
	public void deleteEvent(EventListModel model) {
		this.evRepo.delete(model);
	}
	
	// update the event 
	public EventListModel updateEvent(EventListModel model, int id) {
		model.setId(id);
		evRepo.save(model);
		return model;
	}
	
	

	
	

}
