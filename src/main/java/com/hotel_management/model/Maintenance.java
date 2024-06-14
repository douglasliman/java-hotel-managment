package com.hotel_management.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Maintenance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	Employee employee;
	
	Room room;
	
	Services services;
	
}
