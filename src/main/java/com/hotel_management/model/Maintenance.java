package com.hotel_management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_maintenance")

public class Maintenance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	Employee employee;

	@ManyToOne
	@JoinColumn(name = "room_id")
	Room room;

	@ManyToOne
	@JoinColumn(name = "services_id")
	Services services;
	
}
