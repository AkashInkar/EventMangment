package com.example.akash.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.akash.models.EventListModel;

public interface EventDetailsRepository extends JpaRepository<EventListModel, Integer> {
	
	
	//public Page<EventListModel> findByName(String name,Pageable pageble);

}
