package com.example.akash.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.akash.models.EventListModel;
@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<EventListModel, Integer>{

}
